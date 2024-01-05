package com.zxc.lims.mapper;

import com.github.pagehelper.PageRowBounds;
import com.zxc.lims.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


@Mapper
public interface TeacherMapper {

  void addTeacher(User user);//新增教师账号信息
  void delete(@Param("ids") List<Integer> ids);//删除教师账号
  void update(User user);//修改教师账号
  List<User> getTeacherList(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);//获取教师账号信息列表
  User getUserById(@Param("id") String id);//获取教师账号信息列表
  Integer checkCodeCount();//查看人数
}
