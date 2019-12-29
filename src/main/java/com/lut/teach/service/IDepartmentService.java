package com.lut.teach.service;

import com.lut.teach.bean.Department;
import com.lut.teach.bean.ex.DepartmentEX;

import java.util.List;

public interface IDepartmentService {
    List<DepartmentEX> findAlldepartment() throws RuntimeException;
    List<DepartmentEX> search(String kay,String word) throws RuntimeException;
    void deletedepartmentById(int id) throws RuntimeException;
    void saveOrUpdatedepartment(Department department) throws RuntimeException;
}
