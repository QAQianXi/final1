package com.zxc.lims.mapper;

import com.github.pagehelper.PageRowBounds;
import com.zxc.lims.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description 实验课程信息mapper层
 * Author: zxc
 * Date: 2023/3/11 15:02
 **/
@Mapper
public interface CourseMapper {

  void addCourse(Course course);//新增实验课程信息


  void delete(@Param("ids") List<Long> ids);//删除实验课程信息


  void update(Course course);//修改实验课程信息


  List<Course> getCourseList(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);//获取实验课程信息

  String checkCodeCount(@Param("condition") Map<String, Object> condition);//查看实验课程最大id

  List<Course> getCourseByMap(@Param("condition") Map<String, Object> condition);//根据专业、学期获取实验课程列表

  Course getCourseById(@Param("courseId") String courseId);//据实验课程id获取实验课程信息
}
