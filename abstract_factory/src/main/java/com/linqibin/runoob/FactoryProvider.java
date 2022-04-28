package com.linqibin.runoob;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice) {
        if ("Shape".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if ("color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
