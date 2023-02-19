package com.linqibin.Behavioral.memento.white_box;

/**
 * 备忘录（Memento）角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 *
 * @author lqb
 * @date 2023/2/19
 */
public class RoleMemento {

    private int vit;

    private int atk;

    private int dif;

    public RoleMemento(int vit, int atk, int dif) {
        this.vit = vit;
        this.atk = atk;
        this.dif = dif;
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
}
