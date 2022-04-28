package com.linqibin.runoob;

import com.linqibin.runoob.interfaces.MediaPlayer;

/**
 * 适配器模式 属于结构型设计模式
 * @author lqb
 * @date 2022/4/27
 */
public class Demo {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("mp3", "晴天");
        mediaPlayer.play("mp4", "触电");
        mediaPlayer.play("vlc", "妈妈的朋友");
        mediaPlayer.play("mp5", "善良的小姨子");
    }
}
