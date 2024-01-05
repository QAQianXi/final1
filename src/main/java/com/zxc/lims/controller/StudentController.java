package com.zxc.lims.controller;

import com.zxc.lims.pojo.User;
import com.zxc.lims.service.StudentService;
import com.zxc.lims.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/sms/user/student")
public class StudentController {//学生账号控制层
    @Autowired
    private StudentService studentService;

    @PostMapping
    public void addStudent(@RequestBody User user) {//新增学生账号
        studentService.addStudent(user);
    }

    @DeleteMapping("/{ids}")
    public void delete(@PathVariable("ids") String[] ids) {//删除学生账号
        List<String> idsList = Arrays.asList(ids);
        studentService.delete(idsList);
    }

    @PutMapping
    public void update(@RequestBody User user) {//修改学生账号
        studentService.update(user);
    }

    @GetMapping("/getStudentList")
    public PagingResult<User> getStudentList(@RequestParam Map<String, Object> condition,
                                             @RequestParam(required = false, name = "$limit", defaultValue = "10") Integer limit,
                                             @RequestParam(required = false, name = "$offset", defaultValue = "0") Integer offset) {//获取学生账号信息列表
        RowBounds rowBounds = new RowBounds(offset, limit);
        return studentService.getStudentList(rowBounds, condition);
    }
}
