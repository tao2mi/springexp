package com.ybq.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

public class ClassOne {

    @Autowired
    private ResourceBundleMessageSource ctx;

    public String name;

    public ClassOne(String name) {
        this.name = name;
    }

    public String print() {
        return "======class one: " + name;
    }

    public String printMsg() {
        return "======class one--msg: " + ctx.getMessage("key1", null, null);
    }

}
