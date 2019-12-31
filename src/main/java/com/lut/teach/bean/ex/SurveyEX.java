package com.lut.teach.bean.ex;

import com.lut.teach.bean.*;

import java.util.Date;
import java.util.List;

public class SurveyEX {
    private Integer id;

    private String status;

    private Integer code;

    private Date surveyday;

    private Department department;

    private Course course;

    private Clazz clazz;

    private Questionnaire questionnaire;

    private Teacher teacher;

    private QuestionnaireEX questionnaireEX;

    private List<AnswerEx> answerExes;

    private Integer departmentId;

    private Integer courseId;

    private Integer clazzId;

    private Integer userId;

    private Integer questionnaireId;

    private Double average;

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

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

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

    public List<AnswerEx> getAnswerExes() {
        return answerExes;
    }

    public void setAnswerExes(List<AnswerEx> answerExes) {
        this.answerExes = answerExes;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getClazzId() {
        return clazzId;
    }

    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }
}
