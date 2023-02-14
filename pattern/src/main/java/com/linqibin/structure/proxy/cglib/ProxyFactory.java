package com.linqibin.structure.proxy.cglib;

import com.linqibin.structure.proxy.jdk.SellTicksImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理工厂
 * @author lqb
 * @date 2023/2/14
 */
public class ProxyFactory implements MethodInterceptor {

    private SellTicks sellTicks = new SellTicks();

    public SellTicks getProxyObject() {

        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(SellTicks.class);
        enhancer.setCallback(this);
        return (SellTicks) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理收取费用");
        Object invoke = method.invoke(sellTicks, objects);
        return invoke;
    }
}
