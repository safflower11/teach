package com.lut.teach.mapper.ex;

import com.lut.teach.bean.Qqn;
import com.lut.teach.bean.Questionnaire;
import com.lut.teach.bean.ex.QqnEx;

import java.util.List;

public interface QqnExMapper {
    List<QqnEx> selectAll();
    Questionnaire selectmax();
}
