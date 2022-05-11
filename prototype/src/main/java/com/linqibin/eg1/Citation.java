package com.linqibin.eg1;

/**
 * 原型模式--浅克隆
 * @author lqb
 * @date 2022/5/11
 */
public class Citation implements Cloneable {

    /**
     * 学生姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(name + "同学,被评为三好学生");
    }
}
