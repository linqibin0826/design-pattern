package com.linqibin.basic;

/**
 *
 * @author lqb
 * @date 2022/5/11
 */
public class RealizeType implements Cloneable{

    public RealizeType() {
        System.out.println("调用构造方法创建对象");
    }

    @Override
    protected RealizeType clone() throws CloneNotSupportedException {
        System.out.println("克隆创建对象。");
        return (RealizeType) super.clone();
    }
}
