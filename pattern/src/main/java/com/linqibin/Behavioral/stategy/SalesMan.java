package com.linqibin.Behavioral.stategy;


/**
 * 环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 *
 * @author lqb
 * @date 2023/2/18
 */
public class SalesMan {

    private final AbstractStrategy strategy;

    public SalesMan(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void salesShow() {
        strategy.show();
    }
}
