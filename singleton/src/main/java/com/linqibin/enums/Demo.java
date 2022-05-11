package com.linqibin.enums;

/**
 *
 * @author lqb
 * @date 2022/5/11
 */
public class Demo {

    public static void main(String[] args) {
        ThreadPoolSingleton.INSTANCE.execute(() -> {
            System.out.println(Thread.currentThread().getName());
        });
    }
}
