package com.zxc.lims.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 实验课程表实体类
 * Author: zxc
 * Date: 2023/4/7 13:57
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Timetable {
  private Integer id;
  private Integer weekId;
  private String profession;
  private String grade;
  private Integer year;
  private Integer term;
  private Integer weekNum;
}
