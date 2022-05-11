package com.linqibin.coffee;

import com.linqibin.coffee.factory.DessertFactory;
import com.linqibin.coffee.factory.ItalyFactory;
import com.linqibin.coffee.factory.UsaFactory;
import com.linqibin.coffee.product.Dessert;

/**
 * 1.开闭原则 2.里氏替换原则 3.迪米特法则 4.依赖倒置原则 5.接口隔离原则  6.合成复用原则
 * @author lqb
 * @date 2022/5/11
 */
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
