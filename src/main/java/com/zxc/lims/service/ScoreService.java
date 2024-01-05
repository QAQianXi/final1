package com.zxc.lims.service;

import com.zxc.lims.pojo.Course;
import com.zxc.lims.pojo.Score;
import com.zxc.lims.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface ScoreService {//分数信息接口层
  PagingResult<Course> getCourseList(RowBounds rowBounds, Map<String, Object> condition);
  void addEntry(List<Score> list);
  List<Course> getExportList(Map<String, Object> condition);
  List<Map<String, Object>> getUserNum(Map<String, Object> condition);
  Map<String, Object> getUserTotal(Map<String, Object> condition);
}
