package com.zxc.lims.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 课程具体安排
 * Author: zxc
 * Date: 2023/5/3 14:48
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseInfo {
  /**
   * id
   */
  private Integer id;
  /**
   * 课程id
   */
  private String courseId;
  /**
   *周数 start
   */
  private Integer start;
  /**
   * 周数 end
   */
  private Integer end;
  /**
   * 教室
   */
  private String room;
  /**
   * 专业
   */
  private String profession;


}
