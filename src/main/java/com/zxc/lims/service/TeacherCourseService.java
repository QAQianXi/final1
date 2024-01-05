package com.zxc.lims.service;

import com.zxc.lims.pojo.TeacherCourse;
import com.zxc.lims.pojo.Course;

import java.util.List;
import java.util.Map;


public interface TeacherCourseService {//教师实验课程接口层
  void add(List<TeacherCourse> list);
  void delete(List<Integer> ids);
  void update(TeacherCourse teacherCourse);
  List<TeacherCourse> getCourseListById(String id);
  List<Map<String, Object>> getProfessionInfo(String teacherId);
  List<Map<String, Object>> getProfessionInfoByAdmin();
  Course getCourseInfo(Map<String, Object> condition);
}
