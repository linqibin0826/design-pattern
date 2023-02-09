package com.linqibin.construct.factory._abstract;

import com.linqibin.construct.factory._abstract.product.Coffee;
import com.linqibin.construct.factory._abstract.product.Dessert;

/**
 * 工厂方法模式包括抽象工厂、具体工厂、抽象产品、具体产品四个角色。
 * @author lqb
 * @date 2023/2/8
 */
public class Store {

    /**
     * 关联一个抽象工厂
     */
    private final DessertFactory factory;

    public Store(DessertFactory factory) {
        this.factory = factory;
    }

    public Coffee orderDessert() {
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    public static void main(String[] args) {
        Store store = new Store(new AmericanDessertFactory());
        store.orderDessert();
    }
}
