package com.linqibin.coffee.product.usa;

import com.linqibin.coffee.product.Coffee;

public class AmericanCoffee implements Coffee {

    @Override
    public void show() {
        System.out.println("美式咖啡。。。。");
    }
}
