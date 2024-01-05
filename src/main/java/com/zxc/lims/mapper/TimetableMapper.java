package com.zxc.lims.mapper;

import com.zxc.lims.pojo.Timetable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


@Mapper
public interface TimetableMapper {//实验课程表Mapper层
  void add(Timetable timetable);//新增实验课程表
  List<Timetable> getTimetable(@Param("condition") Map<String, Object> condition);//获取timetable实验课程表信息

  Integer checkCount(@Param("condition") Map<String, Object> condition);//根据专业班级查看实验课程表数量（验证是否添加实验课程表）

  void deleteTimeTable(@Param("condition") Map<String, Object> condition);//删除 timetable表
}
