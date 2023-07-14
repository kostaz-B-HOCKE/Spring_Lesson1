package com.ex.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    private Music classicMusic;

    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicMusic") Music classicMusic,
                       @Qualifier("rockMusic") Music rockMusic) {
        this.classicMusic = classicMusic;
        this.music2 = rockMusic;
    }

    public String playSound() {
        return "Play: " + classicMusic.getSound() + ", " + music2.getSound();
    }
}


//public class MusicPlayer {

//    private List<Music> musicList = new ArrayList<>();
//    private Music music;
//
//    private String name;
//    private int volume;
//
//    private int count;
//
//    public void printStart() {
//        System.out.println("Я родился! c кодом "  + this);
//    }
//
//    public void setMusiclist(List<Music> musicList) {
//        this.musicList = musicList;
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//    public MusicPlayer() {}
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//    public void playSound() {
//        System.out.println("Play: " + music.getSound());
//    }
//}

