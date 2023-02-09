package com.linqibin.structure.proxy._static;

/**
 * 代售点卖票
 * @author lqb
 * @date 2023/2/9
 */
public class ProxyPoint implements SellTicks {

    private SellTicks station = new StationSellTicks();


    @Override
    public void sell() {
        System.out.println("代售点收取手续费");
        station.sell();
    }

    public static void main(String[] args) {
        new ProxyPoint().sell();
    }
}
