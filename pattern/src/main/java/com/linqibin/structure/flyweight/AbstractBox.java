package com.linqibin.structure.flyweight;


/**
 * 抽象享元角色（Flyweight）
 *
 * @author lqb
 * @date 2023/2/18
 */
public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}