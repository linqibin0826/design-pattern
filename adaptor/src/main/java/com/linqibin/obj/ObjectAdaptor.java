package com.linqibin.obj;

/**
 * 对象适配器  中的适配器
 * 需要组合被适配的那个类，
 * @author lqb
 * @date 2022/4/27
 */
public class ObjectAdaptor implements ObjectITarget {

    private ObjectAdaptee adaptee;

    public ObjectAdaptor(ObjectAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void f1() {
        adaptee.fa();
    }

    public void f2() {
        adaptee.fb();
    }

    public void fc() {
        adaptee.fc();
    }
}
