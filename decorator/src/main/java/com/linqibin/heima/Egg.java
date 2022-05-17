package com.linqibin.heima;

/**
 * 具体装饰着类
 * @author lqb
 * @date 2022/5/16
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood, 1.0f, "鸡蛋");
    }

    /**
     * 总金额
     *
     * @return
     */
    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
