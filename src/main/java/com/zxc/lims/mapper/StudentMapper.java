package com.zxc.lims.mapper;

import com.github.pagehelper.PageRowBounds;
import com.zxc.lims.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description 学生用户mapper层
 * Author: zxc
 * Date: 2023/3/7 15:11
 **/
@Mapper
public interface StudentMapper {

  void addStudent(User user);//新增学生账号信息


  void delete(@Param("ids") List<String> ids);//删除学生账号


  void update(User user);//修改学生账号


  List<User> getStudentList(PageRowBounds rowBounds,  @Param("condition") Map<String, Object> condition);//获取学生账号信息列表

  List<User> getStudentTree();//获取树形数据

  List<String> getGradeByProfession(@Param("code") String code);//根据专业获取该专业下的所有班级

  Integer checkCodeCount(@Param("condition") Map<String, Object> condition);//查看人数

  User getUserById(@Param("id") String id);//根据id获取管理员信息

  User getStudentById(@Param("id") String id);//根据id获取学生信息
}
