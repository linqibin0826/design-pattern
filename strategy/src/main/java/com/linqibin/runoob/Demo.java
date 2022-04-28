package com.linqibin.runoob;

import com.linqibin.runoob.strategy.OperationAdd;
import com.linqibin.runoob.strategy.OperationMul;
import com.linqibin.runoob.strategy.OperationSub;

/**
 * 策略模式属于 行为型设计模式
 * @author lqb
 * @date 2022/4/28
 */
public class Demo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.exec(1, 2));

        Context context1 = new Context(new OperationMul());
        System.out.println(context1.exec(1, 2));

        Context context2 = new Context(new OperationSub());
        System.out.println(context2.exec(1, 2));

    }
}
