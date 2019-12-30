package com.lut.teach.service.impl;

import com.lut.teach.bean.ex.SurveyEX;
import com.lut.teach.mapper.SurveyMapper;
import com.lut.teach.mapper.ex.SurveyEXMapper;
import com.lut.teach.service.ISurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyServiceImpl implements ISurveyService {
    @Autowired
    private SurveyEXMapper surveyEXMapper;
    @Autowired
    private SurveyMapper surveyMapper;

    @Override
    public List<SurveyEX> findAll() throws RuntimeException {
       List<SurveyEX> lists = surveyEXMapper.findAll();
        return lists;
    }

    @Override
    public List<SurveyEX> search(String word) throws RuntimeException {
        word = word == null ? "" :word;
        if((word == null || "".equals(word))){
            surveyEXMapper.findAll();
        }
        else{
            word="%" + word +"%";

        }
        return null;
    }
}
