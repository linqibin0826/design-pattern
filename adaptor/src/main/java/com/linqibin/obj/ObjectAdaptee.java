package com.linqibin.obj;

/**
 * 对象适配器，被适配的那个类
 * @author lqb
 * @date 2022/4/27
 */
public class ObjectAdaptee {

    public void fa() {
        System.out.println("被适配的那个类中的a方法");
    }

    public void fb() {
        System.out.println("被适配的那个类中的b方法");
    }

    public void fc() {
        System.out.println("被适配的那个类中的c方法");
    }
}
