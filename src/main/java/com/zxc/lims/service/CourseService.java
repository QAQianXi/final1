package com.zxc.lims.service;

import com.zxc.lims.pojo.Course;
import com.zxc.lims.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface CourseService {//实验课程信息接口层
  void addCourse(Course course);
  void delete(List<Long> ids);
  void update(Course course);
  PagingResult<Course> getCourseList(RowBounds rowBounds, Map<String, Object> condition);
  List<Course> getCourseByMap(Map<String, Object> condition);
}

