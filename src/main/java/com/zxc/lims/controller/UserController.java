package com.zxc.lims.controller;

import com.zxc.lims.pojo.User;
import com.zxc.lims.service.UserService;
import com.zxc.lims.anno.PassToken;
import com.zxc.lims.anno.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;


/**
 * Description 登陆用户控制层
 * Author: zxc
 * Date2023/10/21 21:00
 **/
@RestController
@UserLoginToken
@RequestMapping("/api/sms/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    @PassToken
    public User getStudentInfo(@RequestParam Map<String, Object> condition) {
        Map<String, Object> map = new HashMap<>();
        map.put("username", condition.get("username").toString());
        map.put("password", condition.get("password").toString());
        map.put("level", condition.get("level"));
        User user = userService.getStudentInfo(map);
        if(user == null) {
            return null;
        }
        String token = userService.getToken(user, 24 * 60 * 60 * 1000);
        String refreshToken = userService.getToken(user, 24 * 60 * 60 * 1000); // 有效期一天
        user.setToken(token);
        user.setRefreshToken(refreshToken);
        return user;
    }

    @GetMapping("/edit/password")
    public boolean update(@RequestParam Map<String, Object> condition) {
        Map<String, Object> map = new HashMap<>();
        map.put("username", condition.get("username").toString());
        map.put("password", condition.get("password").toString());
        map.put("passwordAgain", condition.get("passwordAgain").toString());
        map.put("level", condition.get("level").toString());
        return userService.update(map);
    }

    @GetMapping("/getTree")
    public List<Object> getTree() {
        return userService.getTree();
    }

    @PassToken
    @GetMapping("/getSilent")
    public boolean getSilent() {
        return userService.getSilent();
    }

    @PutMapping("/setSilent/{state}")
    public boolean setSilent(@PathVariable("state") Integer state) {
        return userService.setSilent(state);
    }
}
