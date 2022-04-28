package com.linqibin.runoob;

public class Demo {

    public static void main(String[] args) {
        FactoryProvider.getFactory("shape").getShape("circle").draw();
    }
}
