package com.lut.teach.bean.ex;

import com.lut.teach.bean.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SurveyEX implements Serializable {
    private Integer id;

    private String status;

    private Integer code;

    private Date surveyday;

    private Department department;

    private Course course;

    private Clazz clazz;

    //private Questionnaire questionnaire;

    private Teacher teacher;

    private Double average;

    private QuestionnaireEX questionnaireEX;

    private List<Answer> answers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Date getSurveyday() {
        return surveyday;
    }

    public void setSurveyday(Date surveyday) {
        this.surveyday = surveyday;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    /*public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }*/

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public QuestionnaireEX getQuestionnaireEX() {
        return questionnaireEX;
    }

    public void setQuestionnaireEX(QuestionnaireEX questionnaireEX) {
        this.questionnaireEX = questionnaireEX;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
