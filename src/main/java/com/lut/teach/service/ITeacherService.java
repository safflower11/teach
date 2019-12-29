package com.lut.teach.service;

import com.lut.teach.bean.Teacher;

import java.util.List;

public interface ITeacherService {
    List<Teacher> findAll() throws RuntimeException;

    void deleteById(int id) throws RuntimeException;

    Teacher findById(int id) throws RuntimeException;

    void saveOrUpdate(Teacher teacher) throws RuntimeException;

    List<Teacher> search(String key,String word) throws RuntimeException;
}
