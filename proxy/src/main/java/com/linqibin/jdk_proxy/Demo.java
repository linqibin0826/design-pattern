package com.linqibin.jdk_proxy;

/**
 *
 * @author lqb
 * @date 2022/5/12
 */
public class Demo {

    public static void main(String[] args) {
        SellTickets proxyObject = (SellTickets) new ProxyFactory(new TrainStation()).getProxyObject();
        proxyObject.sell();
    }
}
