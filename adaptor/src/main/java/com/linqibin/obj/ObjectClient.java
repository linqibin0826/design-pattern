package com.linqibin.obj;

/**
 * 对象适配器模式
 * @author lqb
 * @date 2022/4/27
 */
public class ObjectClient {

    public static void main(String[] args) {

        ObjectITarget target = new ObjectAdaptor(new ObjectAdaptee());
        target.f1();
        target.f2();
        target.fc();
    }
}
