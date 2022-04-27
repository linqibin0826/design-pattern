package com.linqibin.clazz;

/**
 * 需要被装欢转换的那个已存在的类
 * @author lqb
 * @date 2022/4/27
 */
public class ClassAdaptee {

    public void fa(){
        System.out.println("被适配的那个类中的a方法。。。。。");
    }

    public void fb() {
        System.out.println("被适配的那个类中的b方法。。。。。");
    }

    public void fc() {
        System.out.println("被适配的那个类中的c方法。。。。。");
    }
}
