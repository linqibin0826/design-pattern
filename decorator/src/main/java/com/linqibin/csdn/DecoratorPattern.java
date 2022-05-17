package com.linqibin.csdn;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author lqb
 * @date 2022/5/16
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------装饰之后------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
