package com.lut.teach.mapper.ex;

import com.lut.teach.bean.ex.ClazzEx;

import java.util.List;

public interface ClazzExMapper {
    List<ClazzEx> selectAll();
    List<ClazzEx> selectName(String word);
    List<ClazzEx> selectDescription(String word);
    List<ClazzEx> selectNameOrDescription(String word);
}
