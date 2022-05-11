package com.linqibin.coffee;

import com.linqibin.coffee.factory.CoffeeFactory;
import com.linqibin.coffee.factory.StarBucksFactory;
import com.linqibin.coffee.product.Coffee;

public class Demo {

    public static void main(String[] args) {
        CoffeeFactory factory = new StarBucksFactory();
        Coffee coffee = factory.createCoffee();
        coffee.show();
    }
}
