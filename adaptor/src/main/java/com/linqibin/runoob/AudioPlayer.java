package com.linqibin.runoob;

import com.linqibin.runoob.interfaces.MediaPlayer;

/**
 *
 * @author lqb
 * @date 2022/4/27
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    public void play(String mediaType, String filename) {
        if ("mp3".equalsIgnoreCase(mediaType)) {
            System.out.println("AudioPlayer播放：" + filename + "." + mediaType);
        } else {
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(mediaType, filename);
        }
    }
}
