package com.lut.teach.bean.ex;

import java.io.Serializable;

public class ClassCount implements Serializable {
    private String cname;
    private double average;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
