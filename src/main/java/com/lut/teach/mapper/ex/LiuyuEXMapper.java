package com.lut.teach.mapper.ex;

import com.lut.teach.bean.ex.SurveyEX;

import java.util.List;

public interface LiuyuEXMapper {

    List<SurveyEX> shenheById(int id);

    List<SurveyEX> findAllShen();

    List<SurveyEX> findAllJian();

    List<SurveyEX> findAllAll();

    List<SurveyEX> selectDCCQ(String key1, String key2, String key3, String key4, String word);

    List<SurveyEX> showById(int id);

}
