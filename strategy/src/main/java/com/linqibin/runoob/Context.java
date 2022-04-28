package com.linqibin.runoob;


import com.linqibin.runoob.strategy.Strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int exec(int a, int b) {
        return strategy.doOperation(a, b);
    }
}
