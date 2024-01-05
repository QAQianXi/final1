package com.zxc.lims.service.impl;

import com.zxc.lims.mapper.ProfessionMapper;
import com.zxc.lims.pojo.Profession;
import com.zxc.lims.service.ProfessionService;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import java.util.List;


@Service
public class ProfessionServiceImpl implements ProfessionService {
  @Resource
  private ProfessionMapper professionMapper;

  @Override
  public List<Profession> getProfessionList() {
    return professionMapper.getProfessionList();
  }
}
