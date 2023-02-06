package com.linqibin.lsp.before;

/**
 * 正方形(现实中, 正方形是特殊的矩形,所以可以继承)
 * @author lqb
 * @date 2023/2/6
 */
public class Square extends Rectangle {

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
