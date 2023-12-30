package com.zxc.lims.service.TeacherCourse;

import com.zxc.lims.domain.TeacherCourse;
import com.zxc.lims.dto.Course;

import java.util.List;
import java.util.Map;

/**
 * Description 教师课程Service层
 * Author: zxc
 * Date: 2020/3/29 15:09
 **/
public interface TeacherCourseService {
  /**
   * description: 新增
   * @param list
   * @return void
   * @author zxc
   * @date 2020/3/4 23:05
   */
  void add(List<TeacherCourse> list);

  /**
   * description: 删除
   *
   * @param ids
   * @return void
   * @author zxc
   * @date 2019/8/29 14:55
   */
  void delete(List<Integer> ids);

  /**
   * description: 修改
   * @param teacherCourse
   * @return void
   * @author zxc
   * @date 2019/8/29 14:55
   */
  void update(TeacherCourse teacherCourse);

  /**
   * description: 根据教师id获取教师课程信息
   * @param: String
   * return: List<TeacherCourse>
   * Author: zxc
   * @Date: 2022/3/29 14:31
   */
  List<TeacherCourse> getCourseListById(String id);
  /**
  * description: 根据教师id获取教师用户所管理的专业、班级、课程名等信息
  * @param: String
  * return: List<Map<String, Object>>
  * Author: zxc
  * @Date: 2022/4/4 20:54
  */
  List<Map<String, Object>> getProfessionInfo(String teacherId);
  /**
  * description: 管理员用户获取所有的班级和课程，渲染成下拉框选择
  * return: List<Map<String, Object>>
  * Author: zxc
  * @Date: 2022/4/5 0:16
  */
  List<Map<String, Object>> getProfessionInfoByAdmin();
  /**
  * description: 课程表中获取课程详细信息
  * @param: Map<String, Object> condition
  * return: TeacherCourse
  * Author: zxc
  * @Date: 2022/4/9 17:29
  */
  Course getCourseInfo(Map<String, Object> condition);
}
