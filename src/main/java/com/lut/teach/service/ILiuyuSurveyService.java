package com.lut.teach.service;

import com.lut.teach.bean.ex.SurveyEX;

import java.util.List;

public interface ILiuyuSurveyService {
    void startById(int id) throws RuntimeException;

    void endById(int id) throws RuntimeException;

    List<SurveyEX> shenheById(int id) throws RuntimeException;
    void insert(int id,Integer c) throws RuntimeException;
}
