package com.lut.teach.service.impl;

import com.lut.teach.bean.ex.ResultEx;
import com.lut.teach.mapper.ex.ResultExMapper;
import com.lut.teach.service.IResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ResultServiceImpl implements IResultService {
    @Autowired
    private ResultExMapper resultExMapper;
    @Override
    public List<ResultEx> findBy(String word) throws RuntimeException {
        List<ResultEx> resultExes=resultExMapper.selectByWord(word);
        return resultExes;
    }
}
