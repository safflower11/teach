package com.lut.teach.service;

import com.lut.teach.bean.Qqn;
import com.lut.teach.bean.Questionnaire;
import com.lut.teach.bean.ex.QqnEx;
import com.lut.teach.bean.ex.QuestionnaireEX;

import java.util.List;

public interface IQuestionnaireService {
    List<Questionnaire> findAll() throws RuntimeException;

    void deleteById(int id) throws RuntimeException;

    Questionnaire findById(int id) throws RuntimeException;

    void saveOrUpdate(Questionnaire questionnaire) throws RuntimeException;

    List<Questionnaire> search(String word) throws RuntimeException;

    void insert(Integer id, int question_id);

    Questionnaire findid(Questionnaire questionnaire);

    QuestionnaireEX showById(int id)throws RuntimeException;

    List<QuestionnaireEX> show(int id) throws RuntimeException;


    QqnEx fingquestion(int qqnid) throws RuntimeException;


}
