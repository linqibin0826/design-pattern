package com.linqibin.csdn;

/**
 * 抽象装饰器
 * @author lqb
 * @date 2022/5/16
 */
public class Decorator implements Component {

    /**
     * 组合的对象
     */
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 处理前后可以加一些附加功能
        component.operation();
    }
}
