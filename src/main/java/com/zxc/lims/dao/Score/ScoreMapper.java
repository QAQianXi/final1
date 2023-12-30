package com.zxc.lims.dao.Score;

import com.github.pagehelper.PageRowBounds;
import com.zxc.lims.dto.Course;
import com.zxc.lims.dto.Score;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description 分数信息 Mapper层
 * Author: zxc
 * Date: 2020/3/14 16:25
 **/
@Mapper
public interface ScoreMapper {
  /**
   * description: 教师用户根据专业等获取课程信息
   * param: rowBounds
   * param: condition
   * return: List<Course>
   * Author: zxc
   * @Date: 2022/3/11 15:03
   */
  List<Course> getCourseByMap(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);
  /**
  * description: 管理员用户根据专业、班级查询所有分数信息
  * @param: condition
  * return: List<Course>
  * Author: zxc
  * @Date: 2022/4/1 11:27
  */
  List<Course> getCourseByAdmin(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);
  /**
  * description: 学生用户根据学生id获取所有分数信息
  * @param: condition
  * return: List<Course>
  * Author: zxc
  * @Date: 2022/4/1 17:37
  */
  List<Course> getCourseByStudent(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);
  /**
  * description: 根据学生id和课程名获取分数信息
  * @param: condition
  * return: Course
  * Author: zxc
  * @Date: 2022/4/1 11:36
  */
  Course getScoreById(@Param("condition") Map<String, Object> condition);
  /**
   * description: 录入成绩
   * @param: Score
   * return: void
   * Author: zxc
   * @Date: 2022/3/19 16:23
   */
  void addEntry(Score score);
  /**
  * description: 修改成绩
  * @param: Score
  * return: void
  * Author: zxc
  * @Date: 2022/3/20 11:52
  */
  void updateEntry(Score score);
  /**
   * description: 查看是否录入成绩
   * return: Integer
   * Author: zxc
   * @Date: 2022/3/11 15:03
   */
  Integer checkCount(@Param("condition") Map<String, Object> condition);
  /**
  * description: 教师用户获取导出成绩列表
  * @param: condition
  * return: List<Course>
  * Author: zxc
  * @Date: 2022/3/21 16:27
  */
  List<Course> getExportList(@Param("condition") Map<String, Object> condition);
  /**
   * description: 管理员用户获取导出成绩列表
   * @param: condition
   * return: List<Course>
   * Author: zxc
   * @Date: 2022/3/21 16:27
   */
  List<Course> getExportListByAdmin(@Param("condition") Map<String, Object> condition);
  /**
  * description: 学生用户获取导出成绩列表
  * @param: condition
  * return: List<Course>
  * Author: zxc
  * @Date: 2022/4/1 17:38
  */
  List<Course> getExportListByStudent(@Param("condition") Map<String, Object> condition);
  /**
  * description: 根据学生id获取所有课程的绩点和学分
  * @param: condition
  * return:  List<Course>
  * Author: zxc
  * @Date: 2022/4/12 23:03
  */
  List<Course> getStudentTotal(@Param("condition") Map<String, Object> condition);
}
