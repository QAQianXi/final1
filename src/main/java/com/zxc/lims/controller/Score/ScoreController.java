package com.zxc.lims.controller.Score;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zxc.lims.dto.Course;
import com.zxc.lims.dto.Score;
import com.zxc.lims.service.Score.ScoreService;
import com.zxc.lims.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * Description 成绩查询控制层
 * Author: zxc
 * Date: 2020/3/13 15:25
 **/

@RestController
@RequestMapping("/api/sms/score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/getCourseList")
    public PagingResult<Course> getCourseList(@RequestParam Map<String, Object> condition,
                                              @RequestParam(required = false, name = "$limit", defaultValue = "10") Integer limit,
                                              @RequestParam(required = false, name = "$offset", defaultValue = "0") Integer offset) {
        RowBounds rowBounds = new RowBounds(offset, limit);
        return scoreService.getCourseList(rowBounds, condition);
    }

    @PostMapping
    private void addEntry(@RequestBody JSONArray UserScore) {
        List<Score> list = JSONObject.parseArray(UserScore.toJSONString(), Score.class);
        scoreService.addEntry(list);
    }

    @GetMapping("/export")
    public List<Course> getExportList(@RequestParam Map<String, Object> condition) {
        return scoreService.getExportList(condition);
    }

    @GetMapping("/getUserNum")
    public List<Map<String, Object>> getUserNum(@RequestParam Map<String, Object> condition) {
        return scoreService.getUserNum(condition);
    }

    @GetMapping("/getUserTotal")
    public Map<String, Object> getUserTotal(@RequestParam Map<String, Object> condition) {
        return scoreService.getUserTotal(condition);
    }
}
