package com.zxc.lims.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zxc.lims.pojo.Course;
import com.zxc.lims.pojo.Score;
import com.zxc.lims.service.ScoreService;
import com.zxc.lims.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/sms/score")
public class ScoreController {//实验成绩查询控制层

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/getCourseList")//根据班级等信息获取实验课程信息
    public PagingResult<Course> getCourseList(@RequestParam Map<String, Object> condition,
                                              @RequestParam(required = false, name = "$limit", defaultValue = "10") Integer limit,
                                              @RequestParam(required = false, name = "$offset", defaultValue = "0") Integer offset) {
        RowBounds rowBounds = new RowBounds(offset, limit);
        return scoreService.getCourseList(rowBounds, condition);
    }

    @PostMapping
    private void addEntry(@RequestBody JSONArray UserScore) {//录入成绩
        List<Score> list = JSONObject.parseArray(UserScore.toJSONString(), Score.class);
        scoreService.addEntry(list);
    }

    @GetMapping("/export")
    public List<Course> getExportList(@RequestParam Map<String, Object> condition) {//导出成绩到Excel
        return scoreService.getExportList(condition);
    }

    @GetMapping("/getUserNum")
    public List<Map<String, Object>> getUserNum(@RequestParam Map<String, Object> condition) {//根据成绩划分等级（不及格、及格、优秀）
        return scoreService.getUserNum(condition);
    }

    @GetMapping("/getUserTotal")
    public Map<String, Object> getUserTotal(@RequestParam Map<String, Object> condition) {//学生用户根据id获取总学分和总绩点
        return scoreService.getUserTotal(condition);
    }
}
