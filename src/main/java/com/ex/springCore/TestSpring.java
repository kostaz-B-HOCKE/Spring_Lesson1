package com.ex.springCore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "src/main/delete/applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);
        Computer computer = context.getBean("computer", Computer.class);
//        computer.toString();
        System.out.println(computer);
//        Computer computer1
        context.close();
    }
}
