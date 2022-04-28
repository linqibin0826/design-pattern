package com.linqibin.basic.strategy;

/**
 * 具体的策略
 * @author lqb
 * @date 2022/4/28
 */
public class ConcreteStrategyOne implements Strategy {

    public void strategyMethod() {
        System.out.println("这是具体策略一");
    }
}
