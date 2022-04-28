package com.linqibin.runoob.strategy;

public class OperationAdd implements Strategy {
    /**
     * @param a
     * @param b
     * @return
     */
    public int doOperation(int a, int b) {
        return a + b;
    }
}
