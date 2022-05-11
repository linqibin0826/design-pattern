package com.linqibin.staticproxy;

/**
 * 火车站
 * @author lqb
 * @date 2022/5/11
 */
public class TrainStation implements SellTickets {

    @Override
    public void sell() {
        System.out.println("火车站卖票...");
    }
}
