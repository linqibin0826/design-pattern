package com.linqibin.coffee.factory;

import com.linqibin.coffee.product.Coffee;
import com.linqibin.coffee.product.Dessert;

public interface DessertFactory {

    default Coffee createCoffee(){
        return null;
    }

    default Dessert createDessert() {
        return null;
    }
}
