package com.lut.teach.service.impl;

import com.lut.teach.bean.Teacher;
import com.lut.teach.bean.TeacherExample;
import com.lut.teach.mapper.TeacherMapper;
import com.lut.teach.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> findAll() throws RuntimeException {
        TeacherExample teacherExample = new TeacherExample();

        return teacherMapper.selectByExample(teacherExample);
    }
}
