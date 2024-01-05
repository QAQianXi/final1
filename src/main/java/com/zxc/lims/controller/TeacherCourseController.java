package com.zxc.lims.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zxc.lims.pojo.TeacherCourse;
import com.zxc.lims.pojo.Course;
import com.zxc.lims.service.TeacherCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/sms/teacher/course")
public class TeacherCourseController {//教师实验课程控制层

  @Autowired
  private TeacherCourseService teacherCourseService;

  @PostMapping
  public void add(@RequestBody JSONArray teacherCourseInfo) {//添加教师实验课程
    List<TeacherCourse> list = JSONObject.parseArray(teacherCourseInfo.toJSONString(), TeacherCourse.class);
    teacherCourseService.add(list);
  }

  @DeleteMapping("/{ids}")
  public void delete(@PathVariable("ids") Integer[] ids) {//删除教师实验课程
    List<Integer> idsList = Arrays.asList(ids);
    teacherCourseService.delete(idsList);
  }

  @PutMapping
  public void update(@RequestBody TeacherCourse teacherCourse) {//更改教师实验课程
    teacherCourseService.update(teacherCourse);
  }

  @GetMapping("/getCourseListById/{id}")
  public List<TeacherCourse> getCourseListById(@PathVariable("id") String id) {//根据教师id获取教师实验课程信息
    return teacherCourseService.getCourseListById(id);
  }

  @GetMapping("/getProfessionInfoByTeacher/{teacherId}")
  public List<Map<String, Object>> getProfessionInfo(@PathVariable("teacherId") String teacherId) {//获取教师id和专业获取班级、实验课程名
    return teacherCourseService.getProfessionInfo(teacherId);
  }

  @GetMapping("/getProfessionInfoByAdmin")
  public List<Map<String, Object>> getProfessionInfoByAdmin() {//根据专业、班级和实验课程名获取所授课的教师id
    return teacherCourseService.getProfessionInfoByAdmin();
  }

  @GetMapping("/getCourseInfo")
  public Course getCourseInfo(@RequestParam Map<String, Object> condition) {//实验课程表中获取实验课程详细信息
    return teacherCourseService.getCourseInfo(condition);
  }
}
