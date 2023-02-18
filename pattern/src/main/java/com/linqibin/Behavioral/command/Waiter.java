package com.linqibin.Behavioral.command;

import java.util.List;

/**
 * 调用者/请求者（Invoker）角色： 要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。
 * 这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。
 *
 * @author lqb
 * @date 2023/2/18
 */
public class Waiter {

    private final List<Command> commands;

    public Waiter(List<Command> commands) {
        this.commands = commands;
    }

    public void orderUp() {
        for (Command command : commands) {
            command.execute();
        }
        System.out.println("上菜了....");
    }

    public void addCommands(Command command) {
        commands.add(command);
    }
}
