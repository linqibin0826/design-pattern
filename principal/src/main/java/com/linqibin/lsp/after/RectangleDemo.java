package com.linqibin.lsp.after;



public class RectangleDemo {


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLengthAndWidth(rectangle);
        System.out.println("==============");

        // 代码有问题,将退不出来循环
        Square square = new Square();
        square.setSide(10);
        printLengthAndWidth(square);

    }

    /**
     * 拉长宽度,直到宽度超越长度
     * @param rectangle 依赖关系
     */
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Quadrilateral rectangle) {
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
