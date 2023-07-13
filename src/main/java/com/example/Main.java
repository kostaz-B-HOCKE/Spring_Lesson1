package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Starter.class);

        Dima bean1 = context.getBean(Dima.class);
        Dima bean2 = (Dima)context.getBean("dima");
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean1 == bean2);
    }
}
//