package com.linqibin.csdn;

/**
 * 具体装饰器
 * @author lqb
 * @date 2022/5/16
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        // 在处理父类的方法时，可以在处理前后可以加一些附加功能
        // 如果不调用父类的方法，表示完全改写方法，实现新功能
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}