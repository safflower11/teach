package com.lut.teach.mapper.ex;

import com.lut.teach.bean.ex.SurveyEX;

import java.util.List;

public interface SurveyEXMapper {
    List<SurveyEX> findAll();
    List<SurveyEX> showById(int id);
}
