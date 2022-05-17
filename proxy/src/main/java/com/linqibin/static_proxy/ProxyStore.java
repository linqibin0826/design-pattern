package com.linqibin.static_proxy;

import com.linqibin.jdk_proxy.SellTickets;
import com.linqibin.jdk_proxy.TrainStation;

/**
 * 代售点
 * @author lqb
 * @date 2022/5/11
 */
public class ProxyStore implements SellTickets {

    /**
     * 代售点 组合了火车站(其实也是从火车站买票, 收取了一定的中介费用)
     */
    private SellTickets sellTickets = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取一定费用");
        sellTickets.sell();
    }
}
