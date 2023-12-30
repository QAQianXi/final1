package com.zxc.lims.service.Profession;

import com.zxc.lims.domain.Profession;

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
* @Date: 2022/3/31 17:31
*/
  List<Profession> getProfessionList();
}
