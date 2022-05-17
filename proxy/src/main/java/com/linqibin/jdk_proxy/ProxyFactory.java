package com.linqibin.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    /**
     * 目标对象，需要被代理的对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyObject() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("前置增强。。。");
                        method.invoke(target, args);
                        System.out.println("后置增强。。。");
                        return null;
                    }
                });
    }
}
