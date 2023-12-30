package com.zxc.lims.service.User.impl;

import com.github.pagehelper.PageRowBounds;
import com.zxc.lims.dao.User.AdminMapper;
import com.zxc.lims.dto.User;
import com.zxc.lims.service.User.AdminService;
import com.zxc.lims.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Description
 * Author: zxc
 * Date: 2020/3/28 11:06
 **/
@Service
public class AdminServiceImpl implements AdminService {

  @Resource
  private AdminMapper adminMapper;

  @Override
  public void add(User user) {
    int num = adminMapper.checkCodeCount();
    String username = "980502" + num;
    user.setUsername(username);
    user.setPassword("password");
    adminMapper.add(user);
  }

  @Override
  public void
  delete(List<Integer> ids) {
    adminMapper.delete(ids);
  }

  @Override
  public void update(User user) {
    adminMapper.update(user);
  }

  @Override
  public PagingResult<User> getAdminList(RowBounds rowBounds, Map<String, Object> condition) {
    PageRowBounds pageRowBounds = new PageRowBounds(rowBounds.getOffset(), rowBounds.getLimit());
    List<User> StudentInfoList = adminMapper.getAdminList(pageRowBounds, condition);
    return new PagingResult<>(StudentInfoList, pageRowBounds.getTotal());
  }
}
