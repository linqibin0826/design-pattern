package com.linqibin.basic;

import com.linqibin.basic.strategy.Strategy;

/**
 * 上下问对象
 * @author lqb
 * @date 2022/4/28
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
