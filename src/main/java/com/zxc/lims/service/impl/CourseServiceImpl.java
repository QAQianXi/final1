package com.zxc.lims.service.impl;

import com.github.pagehelper.PageRowBounds;
import com.zxc.lims.mapper.CourseMapper;
import com.zxc.lims.mapper.CourseInfoMapper;
import com.zxc.lims.mapper.ProfessionMapper;
import com.zxc.lims.pojo.CourseInfo;
import com.zxc.lims.pojo.Profession;
import com.zxc.lims.pojo.Course;
import com.zxc.lims.service.CourseService;
import com.zxc.lims.utils.PagingResult;
import jakarta.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description 课程信息业务层
 * Author: zxc
 * Date: 2020/3/11 14:49
 **/
@Service
public class CourseServiceImpl implements CourseService {
  @Resource
  private CourseMapper courseMapper;
  @Resource
  private CourseInfoMapper courseInfoMapper;
  @Resource
  private ProfessionMapper professionMapper;

  @Override
  public void addCourse(Course course) {
    Profession profession =  professionMapper.getProfessionIdByName(course.getProfession());
    String id = "";
    String str = course.getYear().toString() + "0" + profession.getId() + course.getTerm();
    Map<String, Object> condition = new HashMap<>();
    condition.put("profession", course.getProfession());
    condition.put("year", course.getYear());
    String value = courseMapper.checkCodeCount(condition);
    String strValue = "";
    if (value != null) {
      int num = Integer.parseInt(value.substring(value.length() - 3)) + 1;
      if (num < 10) {
        strValue =  "00" + num;
      } else if (num < 100) {
        strValue = "0" + num;
      } else {
        strValue = Integer.toString(num);
      }
    } else {
      strValue = "001";
    }
    id = str + strValue;
    course.setId(id);
    courseMapper.addCourse(course);

    courseInfoMapper.deleteInfo(id);
    // 新增课程的周数等
    CourseInfo courseInfo = new CourseInfo();
    courseInfo.setStart(1);
    courseInfo.setEnd(25);
    courseInfo.setCourseId(id);
    courseInfo.setProfession(course.getProfession());
    courseInfoMapper.addCourseInfo(courseInfo);
  }

  @Override
  public void delete(List<Long> ids) {
    courseMapper.delete(ids);
    for (Long id : ids) {
      courseInfoMapper.deleteInfo(Long.toString(id));
    }
  }

  @Override
  public void update(Course course) {
    courseMapper.update(course);
    CourseInfo courseInfo = new CourseInfo();
    courseInfo.setProfession(course.getProfession());
    courseInfo.setCourseId(course.getId());
    courseInfoMapper.updateCourseInfo(courseInfo);
  }

  @Override
  public PagingResult<Course> getCourseList(RowBounds rowBounds, Map<String, Object> condition) {
    PageRowBounds pageRowBounds = new PageRowBounds(rowBounds.getOffset(), rowBounds.getLimit());
    List<Course> CourseList = courseMapper.getCourseList(pageRowBounds, condition);
    return new PagingResult<>(CourseList, pageRowBounds.getTotal());
  }

  @Override
  public List<Course> getCourseByMap(Map<String, Object> condition) {
    return courseMapper.getCourseByMap(condition);
  }

}
