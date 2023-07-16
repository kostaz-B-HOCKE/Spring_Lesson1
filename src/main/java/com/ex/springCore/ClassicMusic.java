package com.ex.springCore;


import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music{
    private int second;

    public static ClassicMusic getCla() {
        return new ClassicMusic();
    }

    public void doMyInit() {
        System.out.println("init ClassicMusic");
    }

    public void doMyDestroy() {
        System.out.println("destroy ClassicMusic");
    }
    public String getSound() {
        return "Victory: Two Steps From Hell";
    }
}
