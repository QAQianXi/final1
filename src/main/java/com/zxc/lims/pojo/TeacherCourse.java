package com.zxc.lims.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 教师课程任命表实体类
 * Author: zxc
 * Date: 2023/3/29 15:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherCourse {
  /**
   * id
   */
  private Integer id;
  /**
   * 教师id
   */
  private String teacherId;
  /**
   * 教师用户名
   */
  private String username;
  /**
   * 课程名
   */
  private String name;
  /**
   * 专业
   */
  private String profession;
  /**
   * 班级
   */
  private String grade;
  /**
   * 学期
   */
  private Integer term;

  /**
   * 课程id
   */
  private String courseId;

  private CourseInfo courseInfo;
}
