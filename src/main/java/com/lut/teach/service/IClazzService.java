package com.lut.teach.service;

import com.lut.teach.bean.Clazz;
import com.lut.teach.bean.ex.ClazzEx;

import java.util.List;

public interface IClazzService {
    List<ClazzEx> selectAll() throws RuntimeException;
    void delectById(int id) throws RuntimeException;
    void saveOrUpdate(Clazz clazz) throws RuntimeException;
    List<ClazzEx> search(String key,String word) throws RuntimeException;
}
