package com.linqibin.structure.bridge;

/**
 * 具体实现化角色
 * @author lqb
 * @date 2023/2/17
 */
public class REVBFile implements VideoFile {

    @Override
    public void decode(String filename) {
        System.out.println("REVB视频文件:" + filename);
    }
}
