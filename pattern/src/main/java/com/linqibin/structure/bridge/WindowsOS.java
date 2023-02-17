package com.linqibin.structure.bridge;

public class WindowsOS extends Os {
    public WindowsOS(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videoFile.decode(filename);
    }
}
