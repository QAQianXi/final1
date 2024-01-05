package com.zxc.lims.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zxc.lims.pojo.CourseInfo;
import com.zxc.lims.pojo.WeekCourse;
import com.zxc.lims.service.TimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/sms/timetable")
public class TimetableController { //实验课程表控制层
  @Autowired
  private TimetableService timetableService;
  
  @PostMapping
  public void add(@RequestBody JSONArray WeekCourseList) {//新增实验课程表
    List<WeekCourse> list = JSONObject.parseArray(WeekCourseList.toJSONString(), WeekCourse.class);
    timetableService.add(list);
  }

  @GetMapping("/getTimetable")
  public List<WeekCourse> getStudentList (@RequestParam Map<String, Object> condition) {//管理员用户获取实验课程表
    return timetableService.getTimetable(condition);
  }

  @GetMapping("/getTimetableByStudent")
  public List<WeekCourse> getTimetableByStudent (@RequestParam Map<String, Object> condition) {//学生用户获取实验课程表
    return timetableService.getTimetableByStudent(condition);
  }
  @GetMapping("/getTimetableByTeacher")
  public List<WeekCourse> getTimetableByTeacher (@RequestParam Map<String, Object> condition) {//教师用户获取实验课程表
    return timetableService.getTimetableByTeacher(condition);
  }
  @PostMapping("/updateCourseInfo")
  public void updateCourseInfo(@RequestBody CourseInfo courseInfo) {//新增实验课程具体安排（周数等）
    timetableService.updateCourseInfo(courseInfo);
  }

}
