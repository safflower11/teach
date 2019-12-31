package com.lut.teach.bean.ex;

import com.lut.teach.bean.Survey;

import java.io.Serializable;

public class AnswerEx implements Serializable {
    private Integer id;
    private String answer;
    private Survey survey;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }
}
