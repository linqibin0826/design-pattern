package com.linqibin.heima;

/**
 * 具体装饰者
 * @author lqb
 * @date 2022/5/16
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood, 2.0f, "培根");
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
