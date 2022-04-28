package com.linqibin.mask;

/**
 *
 * @author lqb
 * @date 2022/4/28
 */
public class Demo {

    public static void main(String[] args) {
        IMaskFactory high = new HighFactory();
        IMaskFactory low = new LowEndFactory();

        high.createMask().show();
        low.createMask().show();
    }
}
