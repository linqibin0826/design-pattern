package com.linqibin.structure.decorator;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 抽象装饰者
 * @author lqb
 * @date 2023/2/16
 */
@Data
public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
