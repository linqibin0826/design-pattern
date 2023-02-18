package com.linqibin.Behavioral.command;

/**
 * 实现者/接收者（Receiver）角色： 接收者，真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能。
 *
 * @author lqb
 * @date 2023/2/18
 */
public class Chef {

    public void cook(String name, int num) {
        System.out.println("我是厨师,我做了" + num + "份" + name);
    }


}
