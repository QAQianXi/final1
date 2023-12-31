package com.zxc.lims.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 分数信息实体类
 * Author: zxc
 * Date: 2023/3/19 10:55
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Score {
  private Long id;
  private String username;
  private String name;
  private String scoreByUser;
  private String pointByUser;
  private String creditsByUser;
  private Integer score;
  private String credits;
  private Integer term;
  private Integer year;
  private String no;
  private String studentId;
  private String courseId;
}
