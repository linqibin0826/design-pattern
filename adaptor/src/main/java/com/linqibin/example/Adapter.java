package com.linqibin.example;

/**
 * 电源适配器， 把AC220 变成 DC5V
 * @author lqb
 * @date 2022/4/27
 */
public class Adapter extends AC220 implements DC5 {

    public int output5V() {
        System.out.println("适配器输出电压为:" + super.output() / 44);
        return super.output() / 44;
    }
}
