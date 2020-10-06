package com.Faris.Domain;

import org.apache.ibatis.annotations.Insert;

import java.io.Serializable;

public class ComponentFile implements Serializable {
    private Integer id;
    private String file_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    @Override
    public String toString() {
        return "componentfile{" +
                "id=" + id +
                ", file_name='" + file_name + '\'' +
                '}';
    }
}
