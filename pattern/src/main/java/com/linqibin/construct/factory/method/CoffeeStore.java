package com.linqibin.construct.factory.method;

/**
 * 工厂方法模式包括抽象工厂、具体工厂、抽象产品、具体产品四个角色。
 * @author lqb
 * @date 2023/2/8
 */
public class CoffeeStore {

    /**
     * 关联一个抽象工厂
     */
    private final CoffeeFactory factory;

    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        System.out.println(coffee.getName());
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore(new LatteCoffeeFactory());
        store.orderCoffee();
    }
}
