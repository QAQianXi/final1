package com.zxc.lims.mapper;

import com.github.pagehelper.PageRowBounds;
import com.zxc.lims.pojo.Course;
import com.zxc.lims.pojo.Score;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface ScoreMapper {

  List<Course> getCourseByMap(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);//教师用户根据专业等获取实验课程信息

  List<Course> getCourseByAdmin(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);//管理员用户根据专业、班级查询所有分数信息

  List<Course> getCourseByStudent(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);//学生用户根据学生id获取所有分数信息

  Course getScoreById(@Param("condition") Map<String, Object> condition);//根据学生id和实验课程名获取分数信息

  void addEntry(Score score);//录入成绩
  
  void updateEntry(Score score);//修改成绩

  Integer checkCount(@Param("condition") Map<String, Object> condition);//查看是否录入成绩

  List<Course> getExportList(@Param("condition") Map<String, Object> condition);//教师用户获取导出成绩列表

  List<Course> getExportListByAdmin(@Param("condition") Map<String, Object> condition);//管理员用户获取导出成绩列表

  List<Course> getExportListByStudent(@Param("condition") Map<String, Object> condition);//学生用户获取导出成绩列表

  List<Course> getStudentTotal(@Param("condition") Map<String, Object> condition);//根据学生id获取所有实验课程的绩点和学分
}
