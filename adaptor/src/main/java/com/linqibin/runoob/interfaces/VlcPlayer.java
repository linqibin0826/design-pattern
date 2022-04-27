package com.linqibin.runoob.interfaces;

public class VlcPlayer implements AdvancedMediaPlayer {

    public void playVlc(String mediaType, String filename) {
        System.out.println("Vlc播放：" + filename + "." +mediaType);
    }

    public void playMp4(String mediaType, String filename) {
        System.out.println("无法播放Mp4....");
    }
}
