package com.linqibin.construct.factory._abstract;

import com.linqibin.construct.factory._abstract.product.Coffee;
import com.linqibin.construct.factory._abstract.product.Dessert;

public interface DessertFactory {

    Coffee createCoffee();

    Dessert createDessert();
}
