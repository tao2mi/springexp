package com.ybq.webannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigWebApplicationContext ctx =
                new AnnotationConfigWebApplicationContext();
        ctx.scan("com.ybq.webannotation");
        ctx.refresh();
    }
}
