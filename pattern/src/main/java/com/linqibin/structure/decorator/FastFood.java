package com.linqibin.structure.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 抽象构建
 * @author lqb
 * @date 2023/2/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class FastFood {

    private float price;

    private String desc;

    public abstract float cost();

}
