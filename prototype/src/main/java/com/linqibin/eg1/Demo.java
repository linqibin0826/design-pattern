package com.linqibin.eg1;

/**
 * 原型模式_浅克隆Demo
 * 原型模式应用在创建对象 相对比较复杂..  性能和要求比较高
 * @author lqb
 * @date 2022/5/11
 */
public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation prototype = new Citation();
        Citation clone1 = prototype.clone();
        Citation clone2 = prototype.clone();

        clone1.setName("林琪斌");
        clone2.setName("YM");

        clone1.show();
        clone2.show();
    }
}
