package com.zxc.lims.service;

import com.zxc.lims.pojo.Profession;

import java.util.List;

/**
 * Description 专业信息Service层
 * Author: zxc
 * Date: 2020/3/31 17:31
 **/
public interface ProfessionService {
/**
* description: 获取专业
* return:
* Author: zxc
* @Date: 2023/3/31 17:31
*/
  List<Profession> getProfessionList();
}
