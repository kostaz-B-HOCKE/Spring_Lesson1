package com.ex.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    public static final String ANSI_CYAN = "\u001B[36m";
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
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

