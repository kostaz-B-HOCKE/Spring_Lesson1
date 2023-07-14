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

        ClassicMusic classicMusicBean = context.getBean("classicMusic", ClassicMusic.class);
        RockMusic rockMusicBean = context.getBean("rockMusic", RockMusic.class);
        MusicPlayer musicPlayer = new MusicPlayer(classicMusicBean, rockMusicBean);

        musicPlayer.playSound();

        context.close();
    }
}
