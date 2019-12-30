package com.lut.teach.bean.ex;

import com.lut.teach.bean.Qqn;

import java.util.Date;

public class QuestionnaireEX {
    private Integer id;

    private String name;

    private Date date;

    private String description;

    private Qqn qqns;

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

    public Qqn getQqns() {
        return qqns;
    }

    public void setQqns(Qqn qqns) {
        this.qqns = qqns;
    }
}
