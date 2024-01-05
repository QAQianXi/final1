package com.zxc.lims.controller;

import com.zxc.lims.pojo.User;
import com.zxc.lims.service.AdminService;
import com.zxc.lims.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/sms/user/admin")
public class AdminController {//管理员账户控制层
    @Autowired
    private AdminService adminService;

    @PostMapping
    public void addAdmin(@RequestBody User user) {  //新增管理员账号信息
        adminService.add(user);
    }

    @DeleteMapping("/{ids}")
    public void delete(@PathVariable("ids") Integer[] ids) {//删除管理员账号
        List<Integer> idsList = Arrays.asList(ids);
        adminService.delete(idsList);
    }

    @PutMapping
    public void update(@RequestBody User user) {//更新管理员账号信息
        adminService.update(user);
    }


    @GetMapping("/getAdminList")
    public PagingResult<User> getAdminList(@RequestParam Map<String, Object> condition,
                                           @RequestParam(required = false, name = "$limit", defaultValue = "10") Integer limit,
                                           @RequestParam(required = false, name = "$offset", defaultValue = "0") Integer offset) {//获取管理员账号信息列表
        RowBounds rowBounds = new RowBounds(offset, limit);
        return adminService.getAdminList(rowBounds, condition);
    }

}
