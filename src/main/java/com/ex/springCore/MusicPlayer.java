package com.ex.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer() {}

    @Autowired
    @Qualifier("rockMusic")
    public void setMusicList(Music music) {
        musicList.add(music);
    }

    public String playSound() {
        String str = "";
        int count = 0;
        for (Music music : musicList) {
            str = str + music.getSound() + "\n";
        }
        return str;
    }
    //    private Music classicMusic;
//    private Music music2;
//
//    @Autowired
//    public MusicPlayer(@Qualifier("classicMusic") Music classicMusic,
//                       @Qualifier("rockMusic") Music rockMusic) {
//        this.classicMusic = classicMusic;
//        this.music2 = rockMusic;
//    }
//    public String playSound() {
//        return "Play: " + classicMusic.getSound() + ", " + music2.getSound();
//    }
}


