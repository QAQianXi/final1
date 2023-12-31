package com.zxc.lims.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Description 课程信息实体类
 * Author: zxc
 * Date: 2023/3/11 14:50
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
  private String id;
  private String name;
  private Double credits;
  private Integer score;
  private Integer number;
  private Integer year;
  private Integer term;
  private Integer type;
  private String profession;
  private String grade;
  private String realName;
  private String no;
  private String studentId;
  private String pointByUser;
  private String scoreByUser;
  private String creditsByUser;
  private Integer start;
  private Integer end;
  private String room;
  private Date createTime;
}
