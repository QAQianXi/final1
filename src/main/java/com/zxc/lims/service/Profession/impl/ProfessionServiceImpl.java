package com.zxc.lims.service.Profession.impl;

import com.zxc.lims.dao.Profession.ProfessionMapper;
import com.zxc.lims.domain.Profession;
import com.zxc.lims.service.Profession.ProfessionService;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import java.util.List;

/**
 * Description
 * Author: zxc
 * Date: 2020/3/31 17:33
 **/
@Service
public class ProfessionServiceImpl implements ProfessionService {
  @Resource
  private ProfessionMapper professionMapper;

  @Override
  public List<Profession> getProfessionList() {
    return professionMapper.getProfessionList();
  }
}
