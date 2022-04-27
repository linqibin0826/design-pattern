package com.linqibin.runoob;

import com.linqibin.runoob.interfaces.AdvancedMediaPlayer;
import com.linqibin.runoob.interfaces.MediaPlayer;
import com.linqibin.runoob.interfaces.Mp4Player;
import com.linqibin.runoob.interfaces.VlcPlayer;


/**
 * 适配器， 让audioPlayer具备播放高级媒体的适配器
 * @author lqb
 * @date 2022/4/27
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String mediaType) {
        if ("mp4".equalsIgnoreCase(mediaType)) {
            advancedMediaPlayer = new Mp4Player();
        } else if ("vlc".equalsIgnoreCase(mediaType)) {
            advancedMediaPlayer = new VlcPlayer();
        }
    }

    public void play(String mediaType, String filename) {
        if (mediaType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(mediaType, filename);
        } else if (mediaType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(mediaType, filename);
        } else {
            System.out.println("不支持的媒体类型：" + mediaType);
        }
    }
}
