package com.linqibin.Behavioral.stategy;

/**
 * 策略模式的主要角色如下：
 * 抽象策略（Strategy）类：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。
 * 具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现或行为。
 * 环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 *
 * @author lqb
 * @date 2023/2/18
 */
public class Client {

    public static void main(String[] args) {
        new SalesMan(new StrategyA()).salesShow();
        new SalesMan(new StrategyB()).salesShow();
        new SalesMan(new StrategyC()).salesShow();
    }
}
