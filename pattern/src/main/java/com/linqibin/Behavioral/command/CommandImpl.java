package com.linqibin.Behavioral.command;

/**
 * 具体命令（Concrete  Command）角色：具体的命令，实现命令接口；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 *
 * @author lqb
 * @date 2023/2/18
 */
public class CommandImpl implements Command {

    private final Chef chef;

    private final Order order;

    public CommandImpl(Chef chef, Order order) {
        this.chef = chef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("收到" + order.getDiningTable() + "号卓的订单");
        order.getContent().forEach(chef::cook);
    }
}
