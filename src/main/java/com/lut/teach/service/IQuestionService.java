package com.lut.teach.service;

import com.lut.teach.bean.Question;
import com.lut.teach.bean.ex.QuestionEX;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IQuestionService {
    List<QuestionEX> findAll() throws RuntimeException;
    List<QuestionEX> search(String word) throws RuntimeException;
    void deleteQById(int id) throws RuntimeException;
    void saveOrUpdate(Question question) throws RuntimeException;
    void deleteOById(int id) throws RuntimeException;
    Question selectById(int id) throws RuntimeException;



}
