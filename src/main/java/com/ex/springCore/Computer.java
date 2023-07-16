package com.ex.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Computer {
    public static final String ANSI_CYAN = "\u001B[36m";

    @Value("${musicPlayer.name}")
    public String printValueTest;
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        System.out.println(printValueTest);
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {

        return ANSI_CYAN  + "Computer{" +
                "id=" + id +
                ", musicPlayer=" + musicPlayer.playSound() +
                '}';
    }
}

