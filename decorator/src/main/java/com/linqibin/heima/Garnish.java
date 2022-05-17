package com.linqibin.heima;

/**
 * 装饰者
 * @author lqb
 * @date 2022/5/16
 */
public abstract class Garnish extends FastFood{

    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
