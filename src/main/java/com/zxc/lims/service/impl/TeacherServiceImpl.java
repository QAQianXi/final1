package com.zxc.lims.service.impl;

import com.github.pagehelper.PageRowBounds;
import com.zxc.lims.mapper.TeacherMapper;
import com.zxc.lims.pojo.User;
import com.zxc.lims.service.TeacherService;
import com.zxc.lims.utils.PagingResult;
import jakarta.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TeacherServiceImpl implements TeacherService {

  @Resource
  private TeacherMapper teacherMapper;

  @Override
  public void addTeacher(User user) {
    int num = teacherMapper.checkCodeCount();
    String str = "";
    if (num < 10) {
      str = "00" + num;
    } else if (num < 100) {
      str = "0" + num;
    } else {
      str = Integer.toString(num);
    }
    String no = "2020"+str+user.getSex().toString();
    user.setUsername(no);
    user.setId(no);
    user.setPassword("20200101");
    teacherMapper.addTeacher(user);
  }

  @Override
  public void delete(List<Integer> ids) {
    teacherMapper.delete(ids);
  }

  @Override
  public void update(User user) {
    teacherMapper.update(user);
  }

  @Override
  public PagingResult<User> getTeacherList(RowBounds rowBounds, Map<String, Object> condition) {
    PageRowBounds pageRowBounds = new PageRowBounds(rowBounds.getOffset(), rowBounds.getLimit());
    List<User> TeacherInfoList = teacherMapper.getTeacherList(pageRowBounds, condition);
    return new PagingResult<>(TeacherInfoList, pageRowBounds.getTotal());
  }
}
