package com.zxc.lims.mapper;

import com.zxc.lims.pojo.Upload;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;


@Mapper
public interface UploadMapper {
  void add(Upload upload);//上传头像
  String getHead(@Param("condition") Map<String, Object> condition);//获取头像
  void update(Upload upload);//修改用户头像
  Integer checkCount(@Param("condition") Map<String, Object> condition);//根据用户id和等级查询用户是否存在
}
