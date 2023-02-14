package com.linqibin.structure.proxy.jdk;

public class JdkTest {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new SellTicksImpl());
        SellTicks object = (SellTicks) proxyFactory.getProxyObject();
        object.sell();
    }
}
