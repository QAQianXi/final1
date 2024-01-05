package com.zxc.lims.service;

import com.zxc.lims.pojo.User;
import com.zxc.lims.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;


public interface AdminService {//管理员账户接口层
  void add(User user);
  void delete(List<Integer> ids);
  void update(User user);
  PagingResult<User> getAdminList(RowBounds rowBounds, Map<String, Object> condition);
}
