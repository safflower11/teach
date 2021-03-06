package com.lut.teach.service.impl;

import com.lut.teach.bean.Survey;
import com.lut.teach.bean.ex.SurveyEX;
import com.lut.teach.mapper.SurveyMapper;
import com.lut.teach.service.RSurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

@Service
public class RSurveyServiceImpl implements RSurveyService {
    @Autowired
    private SurveyMapper surveyMapper;


  //  @Override
   // public void insert(String dename, String classname, String coursename, String questionname, String teachname, int code) throws RuntimeException {
   //     SurveyEX surveyEX=new SurveyEX();
   //     Survey survey=new Survey();
   //     surveyEX.getClazz().setName(classname);
    //    surveyEX.getCourse().setName(coursename);
    //    surveyEX.getQuestionnaire().setName(questionname);
    //    surveyEX.getTeacher().setName(teachname);
    //    surveyEX.setCode(code);
     //   surveyMapper.insert(survey);
   // }

    @Override
    public void insert(int departid, int classid, int courseid, int questionid, int teachid, Integer code) throws RuntimeException {
        Survey survey=new Survey();
        survey.setDepartmentId(departid);
        survey.setCourseId(courseid);
        survey.setClazzId(classid);
        survey.setQuestionnaireId(questionid);
        survey.setUserId(teachid);
        int codes= (int) Math.round((Math.random()+1) * 1000);
        if(code==null){
            survey.setStatus("未开启");
        }else {
            survey.setCode(codes);
            survey.setStatus("开启");
        }
        survey.setSurveyday(new Date());
        surveyMapper.insert(survey);;

    }

    @Override
    public void update(int id,int departid, int classid, int courseid, int questionid, int teachid, Integer code) throws RuntimeException {
        Survey survey=new Survey();
        survey.setId(id);
        survey.setDepartmentId(departid);
        survey.setCourseId(courseid);
        survey.setClazzId(classid);
        survey.setQuestionnaireId(questionid);
        survey.setUserId(teachid);
        System.out.println(code);
        int codes= (int) Math.round((Math.random()+1) * 1000);
        if(code==null){
            survey.setStatus("未开启");
        }else {
            survey.setCode(codes);
            survey.setStatus("开启");
        }
        survey.setSurveyday(new Date());
        surveyMapper.update(survey);
    }
}
