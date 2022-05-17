package com.linqibin.csdn;

/**
 * 具体构件
 * @author lqb
 * @date 2022/5/16
 */
public class ConcreteComponent implements Component {

    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    /**
     *
     * @author lqb
     * @date 2022/5/16
     */
    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
