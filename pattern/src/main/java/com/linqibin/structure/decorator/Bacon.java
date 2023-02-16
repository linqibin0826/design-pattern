package com.linqibin.structure.decorator;

/**
 * 具体装饰着
 * @author lqb
 * @date 2023/2/16
 */
public class Bacon extends Garnish {
    public Bacon(FastFood fastFood) {
        super(2.0f, "培根", fastFood);
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
