package com.zxc.lims.mapper;

import com.zxc.lims.pojo.CourseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;


@Mapper
public interface CourseInfoMapper {//实验课程具体安排操作

  void addCourseInfo(CourseInfo courseInfo);//新增实验课程具体安排（周数等）

  void updateCourseInfo(CourseInfo courseInfo);//修改实验课程具体安排（周数等）

  void deleteInfo(@Param("id") String id);//删除实验课程具体安排

  CourseInfo getInfo(@Param("condition") Map<String, Object> condition);//获取实验课程信息详情
}
