package com.linqibin.runoob.interfaces;

public class Mp4Player implements AdvancedMediaPlayer {

    public void playVlc(String mediaType, String filename) {
        System.out.println("无法播放vlc类型文件");
    }

    public void playMp4(String mediaType, String filename) {
        System.out.println("Mp4Player播放：" + filename + "." +mediaType);
    }
}
