package com.linqibin.runoob;

public class SingleObject {

    private static SingleObject singleObject = new SingleObject();

    private SingleObject() {

    }

    public static SingleObject getInstance() {
        return singleObject;
    }

    public void show() {
        System.out.println(singleObject);
    }
}
