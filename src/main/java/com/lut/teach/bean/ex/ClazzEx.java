package com.lut.teach.bean.ex;

import com.lut.teach.bean.Region;
import com.lut.teach.bean.Teacher;
import com.lut.teach.bean.TeacherExample;

import java.io.Serializable;

public class ClazzEx implements Serializable {
    private Integer id;
    private String name;
    private Integer serveNumber;
    private Integer studentNumber;
    private String description;
    private DepartmentEX department;
    private Teacher teacher;

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

    public Integer getServeNumber() {
        return serveNumber;
    }

    public void setServeNumber(Integer serveNumber) {
        this.serveNumber = serveNumber;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DepartmentEX getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentEX department) {
        this.department = department;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}
