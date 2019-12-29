package com.lut.teach.service;

import com.lut.teach.bean.Questionnaire;

import java.util.List;

public interface IQuestionnaireService {
    List<Questionnaire> findAll() throws RuntimeException;

    void deleteById(int id) throws RuntimeException;

    Questionnaire findById(int id) throws RuntimeException;

    void saveOrUpdate(Questionnaire questionnaire) throws RuntimeException;

    List<Questionnaire> search(String word) throws RuntimeException;
}
