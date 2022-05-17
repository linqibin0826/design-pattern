package com.linqibin.cglib_proxy;

/**
 *
 * @author lqb
 * @date 2022/5/13
 */
public class Demo {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new TrainStation());
        TrainStation station = (TrainStation) factory.getProxyObject();
        station.sell();
    }
}
