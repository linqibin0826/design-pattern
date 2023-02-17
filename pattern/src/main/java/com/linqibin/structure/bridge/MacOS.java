package com.linqibin.structure.bridge;

/**
 * 拓展抽象化角色
 * @author lqb
 * @date 2023/2/17
 */
public class MacOS extends Os {
    public MacOS(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videoFile.decode(filename);
    }
}
