package com.linqibin.runoob;

/**
 * 工厂模式 属于创建型模式中的一种
 * @author lqb
 * @date 2022/4/28
 */
public class Demo {

    public static void main(String[] args) {
        ShapeFactory.getShape("CIRCLE").draw();
        ShapeFactory.getShape("TRIANGLE").draw();
        ShapeFactory.getShape("RECTANGLE").draw();
    }
}
