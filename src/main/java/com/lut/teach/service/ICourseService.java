package com.lut.teach.service;

import com.lut.teach.bean.Course;
import com.lut.teach.bean.ex.CourseEx;

import java.util.List;

public interface ICourseService {
    List<CourseEx> selectAll() throws RuntimeException;
    void delectById(int id) throws RuntimeException;
    void saveOrUpdate(Course course) throws RuntimeException;
    List<CourseEx> search(String key,String word) throws RuntimeException;
}
