package com.linqibin.Behavioral.state;

/**
 * 环境（Context）角色：也称为上下文，它定义了客户程序需要的接口，维护一个当前状态，并将与状态相关的操作委托给当前状态对象来处理。
 * 抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为。
 * 具体状态（Concrete  State）角色：实现抽象状态所对应的行为。
 *
 * @author lqb
 * @date 2023/2/19
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(startState);

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(stopState);
    }
}
