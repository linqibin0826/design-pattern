package com.linqibin.lsp.after;

import lombok.Data;

@Data
public class Square implements Quadrilateral {

    private double side;

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
