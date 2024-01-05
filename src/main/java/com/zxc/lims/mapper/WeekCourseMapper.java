package com.zxc.lims.mapper;

import com.zxc.lims.pojo.WeekCourse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface WeekCourseMapper {

  void add(WeekCourse weekCourse);

  void update(WeekCourse weekCourse);

  List<WeekCourse> getWeekCourse(@Param("condition") Map<String, Object> condition);
}
