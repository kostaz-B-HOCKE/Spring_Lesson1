package com.ex.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Computer computer = context.getBean("computer", Computer.class);
//        computer.toString();
        System.out.println(computer);

        context.close();
    }
}
