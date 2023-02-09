package com.linqibin.construct.factory._abstract;

import com.linqibin.construct.factory._abstract.product.Coffee;
import com.linqibin.construct.factory._abstract.product.Dessert;
import com.linqibin.construct.factory._abstract.product.LatteCoffee;
import com.linqibin.construct.factory._abstract.product.Tiramisu;

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
