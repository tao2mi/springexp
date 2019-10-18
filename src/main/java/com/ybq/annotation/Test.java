package com.ybq.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        /*AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Configuration1.class);*/
        //WebClassOne classOne = ctx.getBean(WebClassOne.class);
        /*System.out.println(classOne.print());
        ClassTwo classTwo = ctx.getBean(ClassTwo.class);
        System.out.println(classTwo.print());
        Configuration1 classThree = ctx.getBean(Configuration1.class);
        classThree.work();*/

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.scan("com.ybq.annotation");
        ctx.refresh();

        ClassOne classOne = ctx.getBean(ClassOne.class);
        System.out.println(classOne.printMsg());
        System.out.println("==========");
        System.out.println(ctx.getMessage("key1", null, null));
    }
}
