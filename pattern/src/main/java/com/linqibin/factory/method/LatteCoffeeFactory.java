package com.linqibin.factory.method;

/**
 * 具体工厂实现类
 * @author lqb
 * @date 2023/2/8
 */
public class LatteCoffeeFactory implements CoffeeFactory {


    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
