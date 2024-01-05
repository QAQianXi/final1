package com.zxc.lims.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {//实验课程信息类
  private String id;//id
  private String name;//实验课程名
  private Double credits;//学分
  private Integer score;//满分
  private Integer number;//课时
  private Integer year;//届时
  private Integer term;//学期
  private Integer type;//类型 1： 必修  2：选修
  private String profession;//专业
  private String grade;//班级
  private String realName;//姓名
  private String no;//学号
  private String studentId;//学生账号
  private String pointByUser;//查询的学生绩点
  private String scoreByUser;//查询的学生分数
  private String creditsByUser;//查询的学生学分
  private Integer start;//周数 start
  private Integer end;//周数 end
  private String room;//教室
  private Date createTime;//创建时间
}
