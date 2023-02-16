package com.linqibin.structure.decorator;

/**
 * 具体构建
 * @author lqb
 * @date 2023/2/16
 */
public class FriedNoodle extends FastFood {
    public FriedNoodle() {
        super(12.0f, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
