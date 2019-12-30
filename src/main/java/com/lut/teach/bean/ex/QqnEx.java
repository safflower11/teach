package com.lut.teach.bean.ex;

import com.lut.teach.bean.Questionnaire;

import java.io.Serializable;
import java.util.List;

public class QqnEx implements Serializable {
    private Integer id;
    private Questionnaire questionnaire;
    private List<QuestionEx> questionExs;
    private Integer questionId;
    private Integer questionnaireId;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public List<QuestionEx> getQuestionExs() {
        return questionExs;
   }

    public void setQuestionExs(List<QuestionEx> questionExs) {
       this.questionExs = questionExs;
   }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }
}
