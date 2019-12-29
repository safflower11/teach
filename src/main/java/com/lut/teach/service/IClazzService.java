package com.lut.teach.service;

import com.lut.teach.bean.ex.ClazzEx;

import java.util.List;

public interface IClazzService {
    List<ClazzEx> selectAll() throws RuntimeException;
}
