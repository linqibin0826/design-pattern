package com.linqibin.Behavioral.memento.white_box;

/**
 * 管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 *
 * @author lqb
 * @date 2023/2/19
 */
public class CareTaker {

    private final RoleMemento roleMemento;

    public CareTaker(RoleMemento roleMemento) {
        this.roleMemento = roleMemento;
    }

    public RoleMemento getRoleMemento() {
        return roleMemento;
    }
}
