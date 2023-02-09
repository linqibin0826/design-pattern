package com.linqibin.structure.proxy._static;

/**
 * 火车站买票
 * @author lqb
 * @date 2023/2/9
 */
public class StationSellTicks implements SellTicks {

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
