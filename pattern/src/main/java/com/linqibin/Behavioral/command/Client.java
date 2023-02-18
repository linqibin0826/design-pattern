package com.linqibin.Behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式包含以下主要角色：
 * 抽象命令类（Command）角色： 定义命令的接口，声明执行的方法。
 * 具体命令（Concrete  Command）角色：具体的命令，实现命令接口；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 * 实现者/接收者（Receiver）角色： 接收者，真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能。
 * 调用者/请求者（Invoker）角色： 要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。
 * 这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。
 *
 * @author lqb
 * @date 2023/2/18
 */
public class Client {

    public static void main(String[] args) {
        List<Command> commands = new ArrayList<>();
        Chef chef = new Chef();
        Order order = new Order();
        order.setDiningTable(1);
        order.setContent("鱼香肉丝", 1);
        order.setContent("肉末茄子", 1);
        commands.add(new CommandImpl(chef, order));
        Waiter waiter = new Waiter(commands);
        waiter.orderUp();
    }
}
