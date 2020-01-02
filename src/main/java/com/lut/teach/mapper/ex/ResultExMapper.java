package com.lut.teach.mapper.ex;

import com.lut.teach.bean.ex.ResultEx;

import java.util.List;

public interface ResultExMapper {
    List<ResultEx> selectByWord(String word);
}
