package com.lut.teach.service;

import com.lut.teach.bean.ex.SurveyEX;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ISurveyService {
    List<SurveyEX> findAll() throws RuntimeException;
    List<SurveyEX> search(String word) throws RuntimeException;
    List<SurveyEX> showById(int id) throws RuntimeException;
}
