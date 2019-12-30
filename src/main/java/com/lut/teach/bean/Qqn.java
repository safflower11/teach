package com.lut.teach.bean;

import com.lut.teach.bean.ex.QuestionEX;

import java.io.Serializable;
import java.util.List;

public class Qqn implements Serializable {
    private Integer id;

    private Integer questionId;

    private Integer questionnaireId;

    private static final long serialVersionUID = 1L;
    private List<QuestionEX> questionExs;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<QuestionEX> getQuestionExs() {
        return questionExs;
    }

    public void setQuestionExs(List<QuestionEX> questionExs) {
        this.questionExs = questionExs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", questionId=").append(questionId);
        sb.append(", questionnaireId=").append(questionnaireId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


}