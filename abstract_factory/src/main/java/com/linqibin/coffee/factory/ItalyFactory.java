package com.linqibin.coffee.factory;

import com.linqibin.coffee.product.Coffee;
import com.linqibin.coffee.product.Dessert;
import com.linqibin.coffee.product.italy.LatteCoffee;
import com.linqibin.coffee.product.usa.Trimisu;

/**
 * 意大利风味工厂
 * @author lqb
 * @date 2022/4/29
 */
public class ItalyFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
