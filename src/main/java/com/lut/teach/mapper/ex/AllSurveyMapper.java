package com.lut.teach.mapper.ex;

import com.lut.teach.bean.ex.ResultEx;
import com.lut.teach.bean.ex.SurveyEX;

import java.util.List;

public interface AllSurveyMapper {
    List<ResultEx> findAll();

    List<ResultEx> selectDCCQ(String word);

    List<ResultEx> selectDepart(String word);

    List<ResultEx> selectClazz(String word);

    List<ResultEx> selectCourse(String word);

    List<ResultEx> selectQusetionnaire(String word);
}
