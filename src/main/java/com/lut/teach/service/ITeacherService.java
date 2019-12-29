package com.lut.teach.service;

import com.lut.teach.bean.Teacher;

import java.util.List;

public interface ITeacherService {
    List<Teacher> findAll() throws RuntimeException;
}
