package com.linqibin.runoob;

import com.linqibin.runoob.product.Circle;
import com.linqibin.runoob.product.Rectangle;
import com.linqibin.runoob.product.Shape;
import com.linqibin.runoob.product.Triangle;

/**
 * 形状工厂类
 * @author lqb
 * @date 2022/4/28
 */
public class ShapeFactory {

    public static Shape getShape(String type) {
        if ("CIRCLE".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("TRIANGLE".equalsIgnoreCase(type)) {
            return new Triangle();
        } else if ("RECTANGLE".equalsIgnoreCase(type)) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}
