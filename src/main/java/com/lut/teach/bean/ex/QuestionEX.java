package com.lut.teach.bean.ex;


import com.lut.teach.bean.Question;

import javax.swing.text.html.Option;
import java.io.Serializable;
import java.util.List;

public class QuestionEX implements Serializable {
    private Integer id;

    private String name;

    private String type;

    private List<Option> options;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
