package com.lut.teach.service.impl;

import com.lut.teach.bean.*;
import com.lut.teach.mapper.QqnMapper;
import com.lut.teach.mapper.QuestionnaireMapper;
import com.lut.teach.mapper.SurveyMapper;
import com.lut.teach.service.IQuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService {
    @Autowired
    private QuestionnaireMapper questionnaireMapper;
    @Autowired
    private QqnMapper qqnMapper;
    @Autowired
    private SurveyMapper surveyMapper;
    @Override
    public List<Questionnaire> findAll() throws RuntimeException {
        QuestionnaireExample questionnaireExample = new QuestionnaireExample();
        return questionnaireMapper.selectByExample(questionnaireExample);
    }

    @Override
    public void deleteById(int id) throws RuntimeException {
        QqnExample qqnExample = new QqnExample();
        qqnExample.createCriteria().andQuestionnaireIdEqualTo(id);
        qqnMapper.deleteByExample(qqnExample);

        SurveyExample surveyExample = new SurveyExample();
        surveyExample.createCriteria().andQuestionnaireIdEqualTo(id);
        surveyMapper.deleteByExample(surveyExample);

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

    @Override
    public void insert(Integer id, int question_id) {
        Qqn qqn=new Qqn();
        qqn.setQuestionId(question_id);
        qqn.setQuestionnaireId(id);
        qqnMapper.insert(qqn);
    }

    @Override
    public Questionnaire findid(Questionnaire questionnaire) {
        return questionnaireMapper.findid();
    }
}
