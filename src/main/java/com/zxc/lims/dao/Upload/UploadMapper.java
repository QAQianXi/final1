package com.zxc.lims.dao.Upload;

import com.zxc.lims.domain.Upload;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Description 上传
 * Author: zxc
 * Date: 2020/4/29 12:47
 **/
@Mapper
public interface UploadMapper {
  /**
   * description: 上传头像
   *
   * @param: condition
   * return: void
   * Author: zxc
   * @Date: 2022/4/29 11:41
   */
  void add(Upload upload);
  /**
  * description: 获取头像
  * @param: condition
  * return: String
  * Author: zxc
  * @Date: 2022/4/29 14:03
  */
  String getHead(@Param("condition") Map<String, Object> condition);
  /**
  * description: 根据用户id和等级查询用户是否存在
  * @param: condition
  * return: Integer
  * Author: zxc
  * @Date: 2022/4/29 14:19
  */
  Integer checkCount(@Param("condition") Map<String, Object> condition);
  /**
  * description: 修改用户头像
  * @param: upload
  * return: void
  * Author: zxc
  * @Date: 2022/4/29 14:21
  */
  void update(Upload upload);
}
