package com.linqibin.basic;

import com.linqibin.basic.strategy.ConcreteStrategyOne;
import com.linqibin.basic.strategy.ConcreteStrategyTwo;

/**
 *
 * @author lqb
 * @date 2022/4/28
 */
public class Demo {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyTwo());
        Context context1 = new Context(new ConcreteStrategyOne());
        context1.strategyMethod();
        context.strategyMethod();
    }
}
