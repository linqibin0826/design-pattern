package com.linqibin.structure.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点
 *
 * @author lqb
 * @date 2023/2/17
 */
public class Menu extends MenuComponent {

    private final List<MenuComponent> children = new ArrayList<>();

    public Menu(String name, int level) {
        super(name, level);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        children.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        children.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return children.get(index);
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }

        // 打印自己的名字
        System.out.println(this.name);
        // 打印子节点名字
        for (MenuComponent child : children) {
            child.print();
        }
    }
}
