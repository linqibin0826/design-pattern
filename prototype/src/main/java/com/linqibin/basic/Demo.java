package com.linqibin.basic;

/**
 *
 * @author lqb
 * @date 2022/5/11
 */
public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        RealizeType clone = realizeType.clone();
        System.out.println("原型对象是否与克隆对象为同一对象:" + (clone == realizeType));
    }
}
