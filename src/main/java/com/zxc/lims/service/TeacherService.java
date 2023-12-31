package com.zxc.lims.service;

import com.zxc.lims.pojo.User;
import com.zxc.lims.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Description 教师用户接口
 * Author: zxc
 * Date: 2020/3/7 15:05
 **/
public interface TeacherService {
  /**
   * description: 新增教师账号
   * @param user
   * @return void
   * @author zxc
   * @date 2020/3/4 23:05
   */
  void addTeacher(User user);

  /**
   * description: 删除教师账号
   *
   * @param ids
   * @return void
   * @author zxc
   * @date 2019/8/29 14:55
   */
  void delete(List<Integer> ids);

  /**
   * description: 修改教师账号
   *
   * @param user
   * @return void
   * @author zxc
   * @date 2019/8/29 14:55
   */
  void update(User user);

  /**
   * description: 获取教师账号信息列表
   * @param rowBounds
   * @param condition
   * @author zxc
   * @return com.zxc.lims.utils.PagingResult
   * @date 2020/3/4 23:05
   */
  PagingResult<User> getTeacherList(RowBounds rowBounds, Map<String, Object> condition);
}
