package com.linqibin.heima;

/**
 * 具体构件
 * @author lqb
 * @date 2022/5/16
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12f, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
