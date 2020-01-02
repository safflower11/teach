package com.lut.teach.mapper.ex;

import com.lut.teach.bean.ex.ResultEx;

import java.util.List;

public interface ResultExMapper {
    List<ResultEx> selectByWord(String word);
    List<ResultEx> selectword(String word);
    List<ResultEx> findAllSurvey();

    List<ResultEx> selectdepartword(String key1, String word);

    List<ResultEx> selectclassword(String key2, String word);

    List<ResultEx> selectdepart(String key1);

    List<ResultEx> selectclass(String key2);

    List<ResultEx> selectdepartclass(String key1, String key2);

}
