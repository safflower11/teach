package com.lut.teach.mapper.ex;

import com.lut.teach.bean.ex.DepartmentEX;

import java.util.List;

public interface DepartmentEXMapper {
    List<DepartmentEX> findAll();
    List<DepartmentEX> selectIdOrName(String word);
    List<DepartmentEX> selectId(String word);
    List<DepartmentEX> selectName(String word);

}
