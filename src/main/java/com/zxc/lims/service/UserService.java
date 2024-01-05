package com.zxc.lims.service;

import com.zxc.lims.pojo.User;

import java.util.List;
import java.util.Map;



public interface UserService {//登陆用户接口层

  User getUserInfo(Map<String, Object> condition);
  boolean update(Map<String, Object> condition);
  List<Object> getTree();
  String getToken(User user, long time);
  User findUser(Map<String, Object> condition);
  boolean getSilent();
  boolean setSilent(Integer state);
}
