package com.linqibin.structure.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂类
 * @author lqb
 * @date 2023/2/13
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyObject() {
        return Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("对目标对象的前置增强");
                        Object invoke = method.invoke(target, args);
                        System.out.println("对目标对象的后置增强");
                        return invoke;
                    }
                });
    }
}
