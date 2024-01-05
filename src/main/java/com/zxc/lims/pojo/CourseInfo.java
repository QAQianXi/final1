package com.zxc.lims.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseInfo {//课程详情安排

  private Integer id;//id

  private String courseId;//实验课程id

  private Integer start;//周数 start

  private Integer end;//周数 end

  private String room;//教室

  private String profession;//专业


}
