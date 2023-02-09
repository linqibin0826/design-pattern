package com.linqibin.construct.factory._abstract;

import com.linqibin.construct.factory._abstract.product.AmericanCoffee;
import com.linqibin.construct.factory._abstract.product.Coffee;
import com.linqibin.construct.factory._abstract.product.Dessert;
import com.linqibin.construct.factory._abstract.product.MatchaMousse;

public class AmericanDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
