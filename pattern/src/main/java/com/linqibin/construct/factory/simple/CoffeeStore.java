package com.linqibin.construct.factory.simple;

/**
 *
 * @author lqb
 * @date 2023/2/7
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        return CoffeeFactory.createCoffee(type);
    }

    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("美式");
        System.out.println(coffee.getName());
        coffee.addMilk();
        coffee.addSugar();
    }
}
