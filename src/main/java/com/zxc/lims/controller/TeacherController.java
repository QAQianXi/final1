package com.zxc.lims.controller;

import com.zxc.lims.pojo.User;
import com.zxc.lims.service.TeacherService;
import com.zxc.lims.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/sms/user/teacher")
public class TeacherController {//教师账号控制层
  @Autowired
  private TeacherService teacherService;

  @PostMapping
  public void addTeacher(@RequestBody User user) {//新增教师用户
    teacherService.addTeacher(user);
  }

  @DeleteMapping("/{ids}")
  public void delete(@PathVariable("ids") Integer[] ids) {//删除教师用户
    List<Integer> idsList = Arrays.asList(ids);
    teacherService.delete(idsList);
  }

  @PutMapping
  public void update(@RequestBody User user) {//修改教师用户
    teacherService.update(user);
  }

  @GetMapping("/getTeacherList")
  public PagingResult<User> getTeacherList (@RequestParam Map<String, Object> condition,
                                            @RequestParam(required = false, name = "$limit", defaultValue = "10") Integer limit,
                                            @RequestParam(required = false, name = "$offset", defaultValue = "0") Integer offset) {//获取教师账号信息列表
    RowBounds rowBounds = new RowBounds(offset, limit);
    return teacherService.getTeacherList(rowBounds, condition);
  }
}
