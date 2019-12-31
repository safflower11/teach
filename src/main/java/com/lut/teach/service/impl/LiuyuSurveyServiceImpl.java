package com.lut.teach.service.impl;

import com.lut.teach.bean.Survey;
import com.lut.teach.bean.ex.SurveyEX;
import com.lut.teach.mapper.SurveyMapper;
import com.lut.teach.mapper.ex.LiuyuEXMapper;
import com.lut.teach.service.ILiuyuSurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiuyuSurveyServiceImpl implements ILiuyuSurveyService {
    @Autowired
    private SurveyMapper surveyMapper;
    @Autowired
    private LiuyuEXMapper liuyuEXMapper;
    @Override
    public void startById(int id) throws RuntimeException {


        Survey survey = surveyMapper.selectByPrimaryKey(id);

        if(survey.getCode()==null){
            int code=(int) Math.round((Math.random()+1)*1000);
            survey.setCode(code);
            survey.setStatus("开启");
            surveyMapper.updateByPrimaryKey(survey);
        }else {
            System.out.println("已经开启，不能再开启");
        }
    }

    @Override
    public void endById(int id) throws RuntimeException {
        Survey survey = surveyMapper.selectByPrimaryKey(id);

        if(survey.getCode()==null){
            System.out.println("未开启，不能结束");
        }else {
            survey.setStatus("待审核");
            surveyMapper.updateByPrimaryKey(survey);
        }
    }

    @Override
    public List<SurveyEX> shenheById(int id) throws RuntimeException {
        return liuyuEXMapper.shenheById(id);

    }

    @Override
    public void insert(int id,Integer c) throws RuntimeException {
        Survey survey = surveyMapper.selectByPrimaryKey(id);

        if(c==null&&survey.getCode()!=null){
            survey.setStatus("审核不通过");
            surveyMapper.updateByPrimaryKey(survey);
        }else if(c!=null&&survey.getCode()!=null) {
            survey.setStatus("审核通过");
            surveyMapper.updateByPrimaryKey(survey);
        }
    }


}
