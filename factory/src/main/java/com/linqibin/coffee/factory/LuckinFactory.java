package com.linqibin.coffee.factory;

import com.linqibin.coffee.product.Coffee;
import com.linqibin.coffee.product.LuckinCoffee;

public class LuckinFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new LuckinCoffee();
    }
}
