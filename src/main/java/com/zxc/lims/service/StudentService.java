package com.zxc.lims.service;

import com.zxc.lims.pojo.User;
import com.zxc.lims.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface StudentService {//学生账号接口层
  void addStudent(User user);
  void delete(List<String> ids);
  void update(User user);
  PagingResult<User> getStudentList(RowBounds rowBounds, Map<String, Object> condition);
}
