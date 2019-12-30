package com.lut.teach.bean.ex;

import java.io.Serializable;
import java.util.List;

public class QuestionEx implements Serializable {
    private Integer id;
    private String name;
    private String type;
    private List<OptionsEx> optionsExs;

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

    public List<OptionsEx> getOptionsExs() {
        return optionsExs;
    }

    public void setOptionsExs(List<OptionsEx> optionsExs) {
        this.optionsExs = optionsExs;
    }
}
