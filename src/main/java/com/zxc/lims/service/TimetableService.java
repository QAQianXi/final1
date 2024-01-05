package com.zxc.lims.service;

import com.zxc.lims.pojo.CourseInfo;
import com.zxc.lims.pojo.WeekCourse;

import java.util.List;
import java.util.Map;


public interface TimetableService {//实验课程表接口层
  void add(List<WeekCourse> list);
  List<WeekCourse> getTimetable(Map<String, Object> condition);
  List<WeekCourse> getTimetableByStudent(Map<String, Object> condition);
  List<WeekCourse> getTimetableByTeacher(Map<String, Object> condition);
  void updateCourseInfo(CourseInfo courseInfo);
}
