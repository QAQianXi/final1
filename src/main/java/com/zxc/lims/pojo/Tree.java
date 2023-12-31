package com.zxc.lims.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 树形实体类
 * Author: zxc
 * Date: 2020/3/27 22:07
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tree {
  private String name;
  private String[] school;
  private String[] profession;
}
