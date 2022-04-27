package com.linqibin.example;

/**
 * 手机充电客户端
 * @author lqb
 * @date 2022/4/27
 */
public class Client {

    public static void main(String[] args) {
        DC5 dc5 = new Adapter();
        dc5.output5V();
    }
}
