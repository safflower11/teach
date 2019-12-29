package com.lut.teach.service.impl;

import com.lut.teach.bean.ex.ClazzEx;
import com.lut.teach.mapper.ClazzMapper;
import com.lut.teach.mapper.ex.ClazzExMapper;
import com.lut.teach.service.IClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzServiceImpl implements IClazzService {
    @Autowired
    private ClazzExMapper clazzExMapper;
    @Autowired
    private ClazzMapper clazzMapper;

    @Override
    public List<ClazzEx> selectAll() throws RuntimeException {
        List<ClazzEx> clazzExes= clazzExMapper.selectAll();
        return clazzExes;
    }
}
