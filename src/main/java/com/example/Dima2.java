package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dima2 {
    Dima d;

    @Autowired
    public Dima2(Dima d) {
        this.d = d;
    }
}
