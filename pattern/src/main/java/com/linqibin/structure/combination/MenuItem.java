package com.linqibin.structure.combination;

/**
 * 叶子节点
 *
 * @author lqb
 * @date 2023/2/17
 */
public class MenuItem extends MenuComponent {
    public MenuItem(String name, int level) {
        super(name, level);
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(this.name);
    }
}
