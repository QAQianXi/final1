package com.zxc.lims.mapper;

import com.github.pagehelper.PageRowBounds;
import com.zxc.lims.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description 课程信息mapper层
 * Author: zxc
 * Date: 2023/3/11 15:02
 **/
@Mapper
public interface CourseMapper {
  /**
   * description: 新增课程信息
   * @param course
   * @return void
   * @author zxc
   * @Date 2023/3/4 23:05
   */
  void addCourse(Course course);

  /**
   * description: 删除课程信息
   *
   * @param ids
   * @return void
   * @author zxc
   * @date 2023/8/29 14:55
   */
  void delete(@Param("ids") List<Long> ids);

  /**
   * description: 修改课程信息
   *
   * @param course
   * @return void
   * @author zxc
   * @date 2023/8/29 14:55
   */
  void update(Course course);
  /**
  * description: 获取课程信息
  * param: rowBounds
  * param: condition
  * return: List<Course>
  * Author: zxc
  * @Date: 2023/3/11 15:03
  */
  List<Course> getCourseList(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);
  /**
   * description: 查看课程最大id
   * return: Integer
   * Author: zxc
   * @Date: 2023/3/11 15:03
   */
  String checkCodeCount(@Param("condition") Map<String, Object> condition);
  /**
  * description: 根据专业、学期获取课程列表
  * @param: condition
  * return:  List<Course>
  * Author: zxc
  * @Date: 2023/3/31 22:29
  */
  List<Course> getCourseByMap(@Param("condition") Map<String, Object> condition);

  /**
   * description: 根据课程id获取课程信息
   * @param: String
   * return: Course
   * Author: zxc
   * @Date: 2023/3/31 22:29
   */
  Course getCourseById(@Param("courseId") String courseId);
}
