package com.zxc.lims.mapper;

import com.github.pagehelper.PageRowBounds;
import com.zxc.lims.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdminMapper {//管理员账号Mapper层
    void add(User user); //新增管理员账号信息
    void delete(@Param("ids") List<Integer> ids);//删除管理员账号
    void update(User user);//修改管理员账号
    List<User> getAdminList(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);//获取管理员账号信息列表
    User getUserById(@Param("id") String id);//根据管理员id获取管理员信息
    Integer checkCodeCount();//查看管理员人数
}
