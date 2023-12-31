package com.zxc.lims.service.User.impl;

import com.github.pagehelper.PageRowBounds;
import com.zxc.lims.dao.Profession.ProfessionMapper;
import com.zxc.lims.dao.User.StudentMapper;
import com.zxc.lims.domain.Profession;
import com.zxc.lims.dto.User;
import com.zxc.lims.service.User.StudentService;
import com.zxc.lims.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.annotation.Resource;
import java.util.*;

/**
 * Description 学生用户业务层
 * Author: zxc
 * Date: 2020/3/7 15:09
 **/
@Service
public class StudentServiceImpl implements StudentService {

  @Resource
  private StudentMapper studentMapper;
  @Autowired
  private ProfessionMapper professionMapper;

  @Override
  @Transactional
  public void addStudent(User user) {
    int professionId = 0;
    int count = professionMapper.checkProfessionCount(user.getProfession());
    if (count > 0) {
      Profession profession = professionMapper.getProfessionIdByName(user.getProfession());
      professionId = profession.getId();
    } else {
      Profession profession = new Profession();
      profession.setName(user.getProfession());
      professionMapper.addProfession(profession);
      professionId = profession.getId();
    }
    String professionStr = "";
    if (professionId < 10) {
      professionStr = "0" + professionId;
    } else {
      professionStr = Integer.toString(professionId);
    }
    Map<String, Object> condition = new HashMap<>();
    condition.put("profession", user.getProfession());
    condition.put("grade", user.getGrade());
    int num = studentMapper.checkCodeCount(condition) + 1;
    String str = "";
    if (num < 10) {
      str = "0" + num;
    } else if (num < 100) {
      str = Integer.toString(num);
    }
    String no = "3" + user.getAdmissionTime().substring(user.getAdmissionTime().length()-2)
        + "89" + professionStr + user.getGrade().substring(user.getGrade().length()-1) + str;
    user.setId(no);
    user.setUsername(no);
    user.setPassword("123456");
    studentMapper.addStudent(user);
  }

  @Override
  public void
  delete(List<String> ids) {
    studentMapper.delete(ids);
  }

  @Override
  public void update(User user) {
    studentMapper.update(user);
  }

  @Override
  public PagingResult<User> getStudentList(RowBounds rowBounds, Map<String, Object> condition) {
    PageRowBounds pageRowBounds = new PageRowBounds(rowBounds.getOffset(), rowBounds.getLimit());
    List<User> StudentInfoList = studentMapper.getStudentList(pageRowBounds, condition);
    return new PagingResult<>(StudentInfoList, pageRowBounds.getTotal());
  }

}
