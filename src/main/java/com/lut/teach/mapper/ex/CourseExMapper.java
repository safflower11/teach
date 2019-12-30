package com.lut.teach.mapper.ex;

import com.lut.teach.bean.ex.CourseEx;

import java.util.List;

public interface CourseExMapper {
    List<CourseEx> selectAll();
    List<CourseEx> selectName(String word);
    List<CourseEx> selectDescription(String word);
    List<CourseEx> selectNameOrDescription(String word);
}
