package com.ybq.webannotation;


public class WebClassOne {

    public String name;

    public WebClassOne(String name) {
        this.name = name;
    }

    public String print() {
        return "======class one: " + name;
    }

}
