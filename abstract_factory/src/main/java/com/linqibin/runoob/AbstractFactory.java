package com.linqibin.runoob;

import com.linqibin.runoob.product.Color;
import com.linqibin.runoob.product.Shape;

/**
 * 抽象工厂, 生产工厂的工厂
 * 对工厂进行分组,抽象出来他们的特点..
 * @author lqb
 * @date 2022/4/28
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shapeType);

    public abstract Color getColor(String colorType);
}
