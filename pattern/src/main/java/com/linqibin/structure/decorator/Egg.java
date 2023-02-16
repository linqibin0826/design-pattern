package com.linqibin.structure.decorator;

/**
 * 具体装饰着
 * @author lqb
 * @date 2023/2/16
 */
public class Egg extends Garnish {


    public Egg(FastFood fastFood) {
        super(1.0f, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        // 鸡蛋的价格 + 快餐的价格（可能是炒饭也可能是炒面）。
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
