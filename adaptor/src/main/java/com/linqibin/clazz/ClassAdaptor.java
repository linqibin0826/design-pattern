package com.linqibin.clazz;

/**
 * 适配器，将Adaptee转换成一组支持ITarget规范的接口
 * 让Adaptor实现ITarget接口，并且继承Adaptee，这样Adaptor就具备ITarget和Adaptee的特性，就可以将两者进行转化。
 * @author lqb
 * @date 2022/4/27
 */
public class ClassAdaptor extends ClassAdaptee implements ClassITarget {


    public void f1() {
        super.fa();
    }

    public void f2() {
        super.fb();
    }

    // fc 不需要，
}
