package com.linqibin.Behavioral.memento.white_box;

/**
 * 发起人（Originator）角色：记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 *
 * @author lqb
 * @date 2023/2/19
 */
public class Role {

    private int vit;

    private int atk;

    private int dif;

    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.dif = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.dif = 0;
    }

    public RoleMemento saveToMemento() {
        return new RoleMemento(vit, atk, dif);
    }

    public void recover(RoleMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.dif = memento.getDif();
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDif() {
        return dif;
    }

    public void setDif(int dif) {
        this.dif = dif;
    }

    @Override
    public String toString() {
        return "Role{" +
                "vit=" + vit +
                ", atk=" + atk +
                ", dif=" + dif +
                '}';
    }
}
