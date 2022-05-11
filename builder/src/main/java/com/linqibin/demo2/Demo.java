package com.linqibin.demo2;

/**
 *
 * @author lqb
 * @date 2022/5/11
 */
public class Demo {

    public static void main(String[] args) {
        Computer computer = new Computer.PhoneBuilder()
                .cpu("Intel")
                .memory("七彩虹")
                .motherboard("msi")
                .screen("MI").build();
        System.out.println(computer);
    }
}
