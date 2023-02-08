package com.linqibin.factory.simple;

/**
 * 咖啡工厂
 * @author lqb
 * @date 2023/2/7
 */
public class CoffeeFactory {

    public static Coffee createCoffee(String type) {
        if (type.equals("美式")) {
            return new AmericanCoffee();
        } else if (type.equals("拿铁")) {
            return new LatteCoffee();
        } else {
            throw new RuntimeException("本店无此品种咖啡");
        }
    }
}
