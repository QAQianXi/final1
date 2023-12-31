package com.zxc.lims.mapper;

import com.github.pagehelper.PageRowBounds;
import com.zxc.lims.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description 管理员账号Mapper层
 * Author: zxc
 * Date: 2023/3/28 11:08
 **/
@Mapper
public interface AdminMapper {
  /**
   * description: 新增管理员账号信息
   * @param user
   * @return void
   * @author zxc
   * @date 2023/3/4 23:05
   */
  void add(User user);

  /**
   * description: 删除管理员账号
   *
   * @param ids
   * @return void
   * @author zxc
   * @date 2023/8/29 14:55
   */
  void delete(@Param("ids") List<Integer> ids);

  /**
   * description: 修改管理员账号
   *
   * @param user
   * @return void
   * @author zxc
   * @date 2023/8/29 14:55
   */
  void update(User user);

  /**
   * description: 获取管理员账号信息列表
   * @param rowBounds
   * @author zxc
   * @return java.util.List<com.zxc.lims.pojo.User>
   * @date 2023/3/4 23:05
   */
  List<User> getAdminList(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);
  /**
  * description: 根据管理员id获取管理员信息
  * @param: String
  * return: User
  * Author: zxc
  * @Date: 2023/3/30 23:43
  */
  User getUserById(@Param("id") String id);
  /**
   * description: 查看管理员人数
   * return: Integer
   * Author: zxc
   * @Date: 2023/3/11 15:03
   */
  Integer checkCodeCount();
}
