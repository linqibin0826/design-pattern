package com.linqibin.action;

/**
 * 根据不同登录方式，创建不同登录Adaptor
 * @author lqb
 * @date 2022/4/27
 */
public interface ILoginAdaptor {

    boolean support(Object obj);

    ResultMsg login(String str, Object adaptor);
}
