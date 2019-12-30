package com.lut.teach.mapper.ex;

import com.lut.teach.bean.ex.QuestionnaireEX;

import java.util.List;

public interface QuestionnaireEXMapper {
    QuestionnaireEX showById(int id);

    List<QuestionnaireEX> show(int id);
}
