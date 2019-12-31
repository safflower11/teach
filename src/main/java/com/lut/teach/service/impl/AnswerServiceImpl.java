package com.lut.teach.service.impl;

import com.lut.teach.bean.Answer;
import com.lut.teach.mapper.AnswerMapper;
import com.lut.teach.service.IAnswerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements IAnswerServiceImpl {
    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public void deleteById(int id) throws RuntimeException {
        answerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Answer answer) throws RuntimeException {
        answerMapper.updateByPrimaryKey(answer);
    }


}
