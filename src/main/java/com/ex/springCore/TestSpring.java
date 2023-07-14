package com.ex.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        MusicPlayer testBean = context.getBean("musicBean", MusicPlayer.class);

//        MusicPlayer  musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer  secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        boolean comparasion = musicPlayer == secondMusicPlayer;
//        System.out.println("comparasion " + comparasion);

//        musicPlayer.playSound();w
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        System.out.println("musicPlayer.getCount() " + musicPlayer.getCount());
//        secondMusicPlayer.setCount(3);
//        System.out.println("musicPlayer.getCount()); " + musicPlayer.getCount());


        Music beemusicBean = context.getBean("classicMusic", Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(context.getBean("rockMusic", Music.class));
        MusicPlayer musicPlayer = new MusicPlayer(beemusicBean);
        musicPlayer.playSound();
        PlayList playList = new PlayList();
        playList.addMusic(musicPlayer);
        playList.addMusic(musicPlayer2);
        System.out.println(444);
        playList.playSound();
        System.out.println(444);


        context.close();
    }
}
