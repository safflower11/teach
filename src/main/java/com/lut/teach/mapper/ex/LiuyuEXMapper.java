package com.lut.teach.mapper.ex;

import com.lut.teach.bean.ex.SurveyEX;

import java.util.List;

public interface LiuyuEXMapper {

    List<SurveyEX> shenheById(int id);

    List<SurveyEX> findAllShen();

    List<SurveyEX> findAllJian();
}
