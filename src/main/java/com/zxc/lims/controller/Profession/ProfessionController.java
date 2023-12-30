package com.zxc.lims.controller.Profession;

import com.zxc.lims.domain.Profession;
import com.zxc.lims.service.Profession.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description 所有专业控制层
 * Author: zxc
 * Date: 2020/3/31 17:28
 **/
@RestController
@RequestMapping("/api/sms/profession")
public class ProfessionController {

  @Autowired
  private ProfessionService professionService;

  @GetMapping("/getProfessionList")
  private List<Profession> getProfessionList () {
    return professionService.getProfessionList();
  }
}
