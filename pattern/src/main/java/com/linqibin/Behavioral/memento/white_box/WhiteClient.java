package com.linqibin.Behavioral.memento.white_box;

/**
 * 发起人（Originator）角色：记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 * 备忘录（Memento）角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 * 管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 *
 * @author lqb
 * @date 2023/2/19
 */
public class WhiteClient {

    public static void main(String[] args) {
        Role role = new Role();
        role.initState();
        CareTaker careTaker = new CareTaker(role.saveToMemento());
        System.out.println("初始化。。。");
        System.out.println(role);
        System.out.println("战斗。。。。");
        role.fight();
        System.out.println(role);


        role.recover(careTaker.getRoleMemento());
        System.out.println("恢复后。。。。");
        System.out.println(role);
    }
}
