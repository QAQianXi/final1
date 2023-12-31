package com.zxc.lims.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 上传
 * Author: zxc
 * Date: 2020/4/29 12:50
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Upload {
  /**
   * id
   */
  private Integer id;
  /**
   * 用户 id
   */
  private String userId;
  /**
   * 用户等级
   */
  private Integer level;
  /**
   * 储存地址
   */
  private String url;
}
