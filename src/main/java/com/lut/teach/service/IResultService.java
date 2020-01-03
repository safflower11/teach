package com.lut.teach.service;

import com.lut.teach.bean.ex.ResultEx;
import com.lut.teach.bean.ex.SurveyEX;

import java.util.List;

public interface IResultService {
    List<ResultEx> findBy(String word) throws RuntimeException;
    List<ResultEx> fingword(String key1,String key2,String word) throws RuntimeException;
    List<ResultEx> findAll() throws RuntimeException;

    ResultEx findById(int id) throws RuntimeException;
}
