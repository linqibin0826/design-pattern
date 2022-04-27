package com.linqibin.clazz;

/**
 * 客户端类
 * @author lqb
 * @date 2022/4/27
 */
public class ClassClient {

    public static void main(String[] args) {
        ClassITarget target = new ClassAdaptor();
        target.f1();
        target.f2();
        target.fc();
    }
}
