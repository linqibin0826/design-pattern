package com.linqibin.static_proxy;

import com.linqibin.jdk_proxy.SellTickets;

/**
 *
 * @author lqb
 * @date 2022/5/11
 */
public class Demo {

    public static void main(String[] args) {
        SellTickets sellTickets = new ProxyStore();
        sellTickets.sell();
    }
}
