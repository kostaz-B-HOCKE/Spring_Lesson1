package com.ex.springCore;


import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music{
    public String getSound() {
        return "Морда Моцарда";
    }
}
