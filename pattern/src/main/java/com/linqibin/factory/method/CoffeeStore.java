package com.linqibin.factory.method;

/**
 *
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
