package com.lut.teach.service;

import com.lut.teach.bean.Qqn;
import com.lut.teach.bean.Questionnaire;
import com.lut.teach.bean.ex.QqnEx;

import java.util.List;

public interface IQqnService {
    List<QqnEx> selectAll() throws RuntimeException;
    void saveOrUpdate(Qqn qqn) throws RuntimeException;
    void insert(int qid,int qqid) throws RuntimeException;
    Questionnaire selectmax() throws RuntimeException;
    List<Qqn> selectById(int id) throws RuntimeException;
    Qqn selectBy(int id) throws RuntimeException;

}
