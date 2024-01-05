package com.zxc.lims.controller;

import com.zxc.lims.pojo.User;
import com.zxc.lims.service.UserService;
import com.zxc.lims.anno.PassToken;
import com.zxc.lims.anno.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;



@RestController
@UserLoginToken
@RequestMapping("/api/sms/user")
public class UserController { //登陆用户控制层
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    @PassToken
    public User getUserInfo(@RequestParam Map<String, Object> condition) {//根据用户、密码登陆
        Map<String, Object> map = new HashMap<>();
        map.put("username", condition.get("username").toString());
        map.put("password", condition.get("password").toString());
        map.put("level", condition.get("level"));
        User user = userService.getUserInfo(map);
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
    public boolean update(@RequestParam Map<String, Object> condition) {//修改密码
        Map<String, Object> map = new HashMap<>();
        map.put("username", condition.get("username").toString());
        map.put("password", condition.get("password").toString());
        map.put("passwordAgain", condition.get("passwordAgain").toString());
        map.put("level", condition.get("level").toString());
        return userService.update(map);
    }

    @GetMapping("/getTree")
    public List<Object> getTree() {//获取树状数据
        return userService.getTree();
    }

    @PassToken
    @GetMapping("/getSilent")
    public boolean getSilent() {//获取夜间模式
        return userService.getSilent();
    }

    @PutMapping("/setSilent/{state}")
    public boolean setSilent(@PathVariable("state") Integer state) {//修改夜间模式
        return userService.setSilent(state);
    }
}
