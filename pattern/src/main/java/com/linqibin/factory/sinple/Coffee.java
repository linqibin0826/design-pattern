package com.linqibin.factory.sinple;

/**
 *
 * @author lqb
 * @date 2023/2/7
 */
public abstract class Coffee {

    abstract String getName();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加牛奶");
    }
}
