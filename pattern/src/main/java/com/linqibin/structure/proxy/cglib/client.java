package com.linqibin.structure.proxy.cglib;

public class client {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        SellTicks sellTicks = factory.getProxyObject();
        sellTicks.sell();
    }
}
