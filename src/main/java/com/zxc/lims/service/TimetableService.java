package com.zxc.lims.service;

import com.zxc.lims.pojo.CourseInfo;
import com.zxc.lims.pojo.WeekCourse;

import java.util.List;
import java.util.Map;

/**
 * Description 课程表Service层
 * Author: zxc
 * Date: 2023/4/7 14:03
 **/
public interface TimetableService {
  /**
   * description: 新增课程表
   * @param list
   * @return void
   * @author zxc
   * @date 2023/3/4 23:05
   */
  void add(List<WeekCourse> list);

  /**
   * description: 管理员用户获取课程表
   * @param condition
   * @author zxc
   * @return List<WeekCourse>
   * @date 2023/3/4 23:05
   */
  List<WeekCourse> getTimetable(Map<String, Object> condition);
  /**
  * description: 学生用户获取课程表
  * @param: condition
  * return: List<WeekCourse>
  * Author: zxc
  * @Date: 2023/4/7 21:10
  */
  List<WeekCourse> getTimetableByStudent(Map<String, Object> condition);
  /**
  * description: 教师用户获取课程表
  * @param: condition
  * return: List<WeekCourse>
  * Author: zxc
  * @Date: 2023/4/7 21:31
  */
  List<WeekCourse> getTimetableByTeacher(Map<String, Object> condition);
  /**
  * description: 新增课程具体安排（周数等）
  * @param: CourseInfo
  * return: void
  * Author: zxc
  * @Date: 2023/5/3 14:50
  */
  void updateCourseInfo(CourseInfo courseInfo);
}
