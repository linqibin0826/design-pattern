package com.linqibin.structure.bridge;

/**
 * 实现化角色（一个比较小的维度， 文件）供扩展抽象化角色调用
 * @author lqb
 * @date 2023/2/17
 */
public interface VideoFile {

    void decode(String filename);
}
