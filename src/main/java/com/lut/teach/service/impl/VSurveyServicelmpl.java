package com.lut.teach.service.impl;

import com.lut.teach.mapper.SurveyMapper;
import com.lut.teach.mapper.ex.VSurveyExMapper;
import com.lut.teach.service.VSurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VSurveyServicelmpl implements VSurveyService {
    @Autowired
    private VSurveyExMapper vSurveyExMapper;
    @Autowired
    private SurveyMapper surveyMapper;

    @Override
    public void delectById(int id) throws RuntimeException {
        surveyMapper.deleteByPrimaryKey(id);
    }
}
