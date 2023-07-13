package com.ex.springCore;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<>();
    private Music music;

    private String name;
    private int volume;

    private int count;

//    public List<Music> getMusicList() {
//        return musicList;
//    }
//
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }


    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playSound() {
        System.out.println("Play: " + music.getSound());
    }
}

