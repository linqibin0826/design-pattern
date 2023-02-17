package com.linqibin.structure.combination;

/**
 * 抽象根节点
 *
 * @author lqb
 * @date 2023/2/17
 */
public abstract class MenuComponent {

    protected String name;

    protected int level;

    public MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public abstract void print();

}
