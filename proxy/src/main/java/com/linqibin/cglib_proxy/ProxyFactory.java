package com.linqibin.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * 代理工厂，用于获取代理对象
 * @author lqb
 * @date 2022/5/13
 */
public class ProxyFactory {

    /**
     * 目标对象，需要被代理的对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("前置增强。。。");
                Object res = method.invoke(target, objects);
                System.out.println("后置增强。。。");
                return res;
            }
        });
        return enhancer.create();
    }
}
