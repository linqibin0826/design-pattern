package com.linqibin.lsp.after;

import lombok.Data;

@Data
public class Rectangle implements Quadrilateral {

    private double length;

    private double width;

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
