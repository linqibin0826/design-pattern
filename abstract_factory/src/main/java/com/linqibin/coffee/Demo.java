package com.linqibin.coffee;

import com.linqibin.coffee.factory.DessertFactory;
import com.linqibin.coffee.factory.ItalyFactory;
import com.linqibin.coffee.factory.UsaFactory;
import com.linqibin.coffee.product.Dessert;

public class Demo {

    public static void main(String[] args) {
        DessertFactory factory = new UsaFactory();
        factory.createCoffee().show();
        factory.createDessert().show();

        DessertFactory italyFactory = new ItalyFactory();
        italyFactory.createDessert();
        italyFactory.createCoffee();
    }
}
