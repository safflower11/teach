package com.lut.teach.service.impl;

import com.lut.teach.bean.Questionnaire;
import com.lut.teach.bean.QuestionnaireExample;
import com.lut.teach.mapper.QuestionnaireMapper;
import com.lut.teach.service.IQuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService {
    @Autowired
    private QuestionnaireMapper questionnaireMapper;
    @Override
    public List<Questionnaire> findAll() throws RuntimeException {
        QuestionnaireExample questionnaireExample = new QuestionnaireExample();
        return questionnaireMapper.selectByExample(questionnaireExample);
    }

    @Override
    public void deleteById(int id) throws RuntimeException {
        questionnaireMapper.deleteByPrimaryKey(id);

    }

    @Override
    public Questionnaire findById(int id) throws RuntimeException {
        QuestionnaireExample questionnaireExample = new QuestionnaireExample();
        return questionnaireMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Questionnaire questionnaire) throws RuntimeException {
        if(questionnaire==null){
            throw new RuntimeException("参数为空");
        }
        if(questionnaire.getId()==null){
            questionnaireMapper.insert(questionnaire);
        }else {
            questionnaireMapper.updateByPrimaryKey(questionnaire);
        }

    }

    @Override
    public List<Questionnaire> search(String word) throws RuntimeException {
        word =word==null?"":word;
        if (word == null || "".equals(word)) {
            return findAll();
        }else {
            word="%"+word+"%";
            return  questionnaireMapper.search(word);
        }
        //return null;
    }
}
