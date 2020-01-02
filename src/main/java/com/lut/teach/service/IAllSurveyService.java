package com.lut.teach.service;

import com.lut.teach.bean.ex.ResultEx;
import com.lut.teach.bean.ex.SurveyEX;

import java.util.List;

public interface IAllSurveyService {
    List<SurveyEX> findAll() throws RuntimeException;

    List<SurveyEX> search(String key1, String key2, String key3, String key4, String word) throws RuntimeException;
}
