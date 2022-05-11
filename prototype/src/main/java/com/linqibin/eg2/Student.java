package com.linqibin.eg2;

/**
 *
 * @author lqb
 * @date 2022/5/11
 */
public class Student implements Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
