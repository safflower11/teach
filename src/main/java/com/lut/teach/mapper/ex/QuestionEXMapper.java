package com.lut.teach.mapper.ex;

import com.lut.teach.bean.Question;
import com.lut.teach.bean.ex.QuestionEX;

import java.util.List;

public interface QuestionEXMapper {
    List<QuestionEX> findAll();
    List<QuestionEX> selectNameOrType(String word);


}
