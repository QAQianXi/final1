package com.zxc.lims.mapper;

import com.zxc.lims.pojo.TeacherCourse;
import com.zxc.lims.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


@Mapper
public interface TeacherCourseMapper {

  void add(TeacherCourse teacherCourse);//添加教师实验课程


  void delete(@Param("ids") List<Integer> ids);//删除教师实验课程


  void update(TeacherCourse teacherCourse);//更改教师实验课程


  List<TeacherCourse> getCourseListById(@Param("id") String id);//根据教师id获取教师实验课程信息

  List<TeacherCourse> getGradeInfoByMap(@Param("condition") Map<String, Object> condition);//获取教师id和专业获取班级、实验课程名

  String getTeacherId(@Param("condition") Map<String, Object> condition);//根据专业、班级和实验课程名获取所授课的教师id

  Course getCourseInfo(@Param("condition") Map<String, Object> condition);//实验课程表中获取实验课程详细信息
}
