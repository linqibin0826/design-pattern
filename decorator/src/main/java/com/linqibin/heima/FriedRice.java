package com.linqibin.heima;

/**
 * 具体构件
 * @author lqb
 * @date 2022/5/16
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10f, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
