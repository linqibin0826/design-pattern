package com.linqibin.structure.proxy.jdk;

/**
 * 火车站买票
 * @author lqb
 * @date 2023/2/13
 */
public class SellTicksImpl implements SellTicks {

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
