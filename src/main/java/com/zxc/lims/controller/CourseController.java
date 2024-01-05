package com.zxc.lims.controller;

import com.zxc.lims.pojo.Course;
import com.zxc.lims.service.CourseService;
import com.zxc.lims.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@RestController
@RequestMapping("/api/sms/course")
public class CourseController { //实验实验课程控制层

    @Autowired
    private CourseService courseService;

    @PostMapping
    public void addCourse(@RequestBody Course course) {//新增实验课程信息
        courseService.addCourse(course);
    }

    @DeleteMapping("/{ids}")
    public void delete(@PathVariable("ids") String[] ids) {//删除实验课程信息
        List<Long> idsList = Stream.of(ids).map(Long::parseLong).collect(Collectors.toList());
        courseService.delete(idsList);
    }

    @PutMapping
    public void update(@RequestBody Course course) {//修改实验课程信息
        courseService.update(course);
    }

    @GetMapping("/getCourseList")
    private PagingResult<Course> getCourseList(@RequestParam Map<String, Object> condition,
                                               @RequestParam(required = false, name = "$limit", defaultValue = "10") Integer limit,
                                               @RequestParam(required = false, name = "$offset", defaultValue = "0") Integer offset) {//查询实验课程信息
        RowBounds rowBounds = new RowBounds(offset, limit);
        return courseService.getCourseList(rowBounds, condition);
    }

    @GetMapping("/getCourseByMap")
    private List<Course> getCourseByMap(@RequestParam Map<String, Object> condition) {//根据专业、学期获取实验课程列表
        return courseService.getCourseByMap(condition);
    }
}
