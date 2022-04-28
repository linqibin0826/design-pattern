package com.linqibin.runoob;

import com.linqibin.runoob.product.*;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if ("red".equalsIgnoreCase(colorType)) {
            return new Red();
        } else if ("green".equalsIgnoreCase(colorType)) {
            return new Green();
        } else if ("black".equalsIgnoreCase(colorType)) {
            return new Black();
        }
        return null;
    }
}
