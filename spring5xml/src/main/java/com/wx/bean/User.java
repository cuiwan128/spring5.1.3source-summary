package com.wx.bean;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String name = "小王";
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
