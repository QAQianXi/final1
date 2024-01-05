package com.zxc.lims.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 上传
 * Author: zxc
 * Date: 2023/4/29 12:50
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Upload {
  private Integer id;
  private String userId;//用户 id
  private Integer level;//用户等级
  private String url;//储存地址
}
