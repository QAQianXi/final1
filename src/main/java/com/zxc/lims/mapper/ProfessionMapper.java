package com.zxc.lims.mapper;

import com.zxc.lims.pojo.Profession;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface ProfessionMapper {

  List<Profession> getProfessionList();//获取所有专业

  Integer checkProfessionCount(@Param("name") String name);//根据专业名查询专业数量（判断是否存在该专业）

  void addProfession(Profession profession);//新增专业

  void deleteProfession(@Param("id") Integer id);//删除专业

  Profession getProfessionIdByName(@Param("name") String name);//根据专业名查询专业信息
}
