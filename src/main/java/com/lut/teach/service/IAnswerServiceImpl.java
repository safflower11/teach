package com.lut.teach.service;

import com.lut.teach.bean.Answer;

public interface IAnswerServiceImpl {
    void deleteById(int id) throws RuntimeException;
    void update(Answer answer)throws RuntimeException;
}
