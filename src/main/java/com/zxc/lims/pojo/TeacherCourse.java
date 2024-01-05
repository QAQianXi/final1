package com.zxc.lims.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 教师实验课程任命表实体类
 * Author: zxc
 * Date: 2023/3/29 15:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherCourse {
  private Integer id;//id
  private String teacherId;//教师id
  private String username;//教师用户名
  private String name;//实验课程名
  private String profession;//专业
  private String grade;//班级
  private Integer term;//学期
  private String courseId;//实验课程id
  private CourseInfo courseInfo;
}
