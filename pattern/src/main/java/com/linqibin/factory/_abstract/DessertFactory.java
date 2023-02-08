package com.linqibin.factory._abstract;

import com.linqibin.factory._abstract.product.Coffee;
import com.linqibin.factory._abstract.product.Dessert;

public interface DessertFactory {

    Coffee createCoffee();

    Dessert createDessert();
}
