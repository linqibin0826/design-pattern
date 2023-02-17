package com.linqibin.structure.bridge;

/**
 * 抽象化角色（操作系统，一个比较大的维度）
 * @author lqb
 * @date 2023/2/17
 */
public abstract class Os {

    protected final VideoFile videoFile;

    public Os(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String filename);
}
