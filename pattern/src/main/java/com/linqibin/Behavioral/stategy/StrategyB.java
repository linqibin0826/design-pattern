package com.linqibin.Behavioral.stategy;

/**
 * 具体策略
 *
 * @author lqb
 * @date 2023/2/18
 */
public class StrategyB extends AbstractStrategy {

    @Override
    public void show() {
        System.out.println("买一送二");
    }
}
