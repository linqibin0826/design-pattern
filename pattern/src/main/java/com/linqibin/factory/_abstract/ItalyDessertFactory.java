package com.linqibin.factory._abstract;

import com.linqibin.factory._abstract.product.*;

/**
 * 具体工厂实现类
 * @author lqb
 * @date 2023/2/8
 */
public class ItalyDessertFactory implements DessertFactory {


    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
