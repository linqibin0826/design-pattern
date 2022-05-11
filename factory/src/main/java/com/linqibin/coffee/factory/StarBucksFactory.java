package com.linqibin.coffee.factory;

import com.linqibin.coffee.product.Coffee;
import com.linqibin.coffee.product.StarBucksCoffee;

public class StarBucksFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new StarBucksCoffee();
    }
}
