package com.linqibin.construct.factory.method;


public abstract class Coffee {

    abstract String getName();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加牛奶");
    }
}
