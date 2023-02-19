package com.linqibin.Behavioral.memento.black_box;

import com.linqibin.Behavioral.memento.white_box.CareTaker;
import com.linqibin.Behavioral.memento.white_box.Role;

/**
 * 负责人角色类 `Caretaker` 能够得到的备忘录对象是以 `Memento` 为接口的，由于这个接口仅仅是一个标识接口，
 * 因此负责人角色不可能改变这个备忘录对象的内容,除了发起者能得到宽接口外，所有人都只有窄接口，因此不能对备忘录做做任何修改操作。
 * 因此称为黑箱
 *
 * @author lqb
 * @date 2023/2/19
 */
public class Client {

    public static void main(String[] args) {
        com.linqibin.Behavioral.memento.white_box.Role role = new Role();
        role.initState();
        com.linqibin.Behavioral.memento.white_box.CareTaker careTaker = new CareTaker(role.saveToMemento());
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
