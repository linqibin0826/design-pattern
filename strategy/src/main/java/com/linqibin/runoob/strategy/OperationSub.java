package com.linqibin.runoob.strategy;

/**
 * 其中一种策略
 * @author lqb
 * @date 2022/4/28
 */
public class OperationSub implements Strategy {
    /**
     * @param a
     * @param b
     * @return
     */
    public int doOperation(int a, int b) {
        return a - b;
    }
}
