package com.ex.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicMusic classicMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicMusic music, RockMusic music2) {
        this.classicMusic = music;
        this.rockMusic = music2;
    }

    public void playSound() {
        System.out.println("Play: " + classicMusic.getSound());
        System.out.println("Play: " + rockMusic.getSound());
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

