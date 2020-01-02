package com.lut.teach.bean.ex;

import com.lut.teach.bean.Qqn;
import com.lut.teach.bean.Question;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class QuestionnaireEX implements Serializable {
    private Integer id;

    private String name;

    private Date date;

    private String description;

    private List<Qqn> qqns;

    private List<Question> questions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Qqn> getQqns() {
        return qqns;
    }

    public void setQqns(List<Qqn> qqns) {
        this.qqns = qqns;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
