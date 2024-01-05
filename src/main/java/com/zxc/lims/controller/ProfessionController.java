package com.zxc.lims.controller;

import com.zxc.lims.pojo.Profession;
import com.zxc.lims.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/sms/profession")
public class ProfessionController {//所有专业控制层

  @Autowired
  private ProfessionService professionService;

  @GetMapping("/getProfessionList")
  private List<Profession> getProfessionList () {//获取专业
    return professionService.getProfessionList();
  }
}
