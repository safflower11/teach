package com.lut.teach.service.impl;

import com.lut.teach.bean.Question;
import com.lut.teach.bean.ex.QuestionEX;
import com.lut.teach.mapper.OptionsMapper;
import com.lut.teach.mapper.QuestionMapper;
import com.lut.teach.mapper.ex.QuestionEXMapper;
import com.lut.teach.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import com.lut.teach.bean.Options;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements IQuestionService {
    @Autowired
    private QuestionEXMapper questionEXMapper;
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private OptionsMapper optionsMapper;

    @Override
    public List<QuestionEX> findAll() throws RuntimeException {
        List<QuestionEX> lists = questionEXMapper.findAll();
        return lists;
    }

    @Override
    public List<QuestionEX> search(String word) throws RuntimeException {
        word = word == null ? "" :word;
        if((word == null || "".equals(word))){
            questionEXMapper.findAll();
        }
        else{
            word="%" + word +"%";
            return questionEXMapper.selectNameOrType(word);
        }
        return null;
    }

    @Override
    public void deleteQById(int id) throws RuntimeException {
        questionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Question question) throws RuntimeException {
        if(question == null){
            throw new RuntimeException("参数为空！");
        }else if(question.getId()==null){
            questionMapper.insert(question);
        }else {
            questionMapper.updateByPrimaryKey(question);

        }
    }

    @Override
    public void deleteOById(int id) throws RuntimeException {
        optionsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Question selectById(int id) throws RuntimeException {
        Question question=questionMapper.selectByPrimaryKey(id);
        return question;
    }


}
