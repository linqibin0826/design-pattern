package com.linqibin.coffee.factory;

import com.linqibin.coffee.product.Coffee;
import com.linqibin.coffee.product.Dessert;
import com.linqibin.coffee.product.usa.AmericanCoffee;
import com.linqibin.coffee.product.usa.Trimisu;

/**
 *  美式风味的工厂
 * @author lqb
 * @date 2022/4/29
 */
public class UsaFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
