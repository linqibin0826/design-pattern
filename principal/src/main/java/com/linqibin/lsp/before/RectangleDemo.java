package com.linqibin.lsp.before;

/**
 * 里氏替换原则  经典案例(优化前)
 * 任何基类可以出现的地方，子类一定可以出现。(此案例不符合.)
 * @author lqb
 * @date 2023/2/6
 */
public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLengthAndWidth(rectangle);
        System.out.println("==============");

        // 代码有问题,将退不出来循环
        Rectangle square = new Square();
        square.setWidth(20);
        square.setLength(10);
        resize(square);
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

    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
