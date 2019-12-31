package com.lut.teach.service;

import com.lut.teach.bean.Survey;
import com.lut.teach.bean.ex.SurveyEX;

public interface RSurveyService {
    void insert(int departid,int classid,int courseid,int questionid,int teachid,Integer code) throws RuntimeException;
    void update(int id,int departid,int classid,int courseid,int questionid,int teachid,Integer code) throws RuntimeException;
}
