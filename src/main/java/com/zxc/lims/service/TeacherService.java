package com.zxc.lims.service;

import com.zxc.lims.pojo.User;
import com.zxc.lims.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface TeacherService {//教师用户接口层
  void addTeacher(User user);
  void delete(List<Integer> ids);
  void update(User user);
  PagingResult<User> getTeacherList(RowBounds rowBounds, Map<String, Object> condition);
}
