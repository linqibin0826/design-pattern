package com.linqibin.structure.decorator;

/**
 * 具体构件
 * @author lqb
 * @date 2023/2/16
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10.0f, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
