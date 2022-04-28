package com.linqibin.runoob.strategy;

public class OperationMul implements Strategy {
    /**
     * @param a
     * @param b
     * @return
     */
    public int doOperation(int a, int b) {
        return a * b;
    }
}
