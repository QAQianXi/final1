package com.zxc.lims.service;

import com.zxc.lims.pojo.Upload;

import java.util.Map;

/**
 * Description 上传文件service层
 * Author: zxc
 * Date: 2020/4/29 13:54
 **/
public interface UploadService {
  /**
   * description: 上传头像
   * @param: upload
   * return: void
   * Author: zxc
   * @Date: 2023/4/29 11:40
   */
  void upload(Upload upload);
  /**
  * description: 获取头像
  * @param: condition
  * return: String
  * Author: zxc
  * @Date: 2023/4/29 14:02
  */
  String getHeader(Map<String, Object> condition);
}
