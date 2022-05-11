package com.linqibin.staticproxy;

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
