package com.zxc.lims.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 专业实体类
 * Author: zxc
 * Date: 2023/3/31 17:25
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profession {
  /**
   * 专业id
   */
  private Integer id;
  /**
   * 专业名
   */
  private String name;

}
