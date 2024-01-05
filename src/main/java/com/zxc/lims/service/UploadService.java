package com.zxc.lims.service;

import com.zxc.lims.pojo.Upload;

import java.util.Map;

public interface UploadService {//上传文件接口层
  void upload(Upload upload);
  String getHeader(Map<String, Object> condition);
}
