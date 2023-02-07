package com.linqibin.singleton.lazy;

import java.io.Serializable;

/**
 * 懒汉式
 *
 * @author lqb
 * @date 2023/2/7
 */
public class Singleton implements Serializable {

    private Singleton() {
        // 防止反射破坏单例模式, 防止多线程问题
        synchronized (Singleton.class) {
            if (instance != null) {
                throw new RuntimeException("不能创建多个对象");
            }
        }

    }

    // 声明为volatile 防止指令重排序,出现空指针问题
    private static volatile Singleton instance;

    // 线程不安全
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // 直接在方法上面添加synchronize, 性能劣势, 大部分都是读操作,浪费.
    public static synchronized Singleton getInstance1() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // DCL, 双重校验
    public static Singleton getInstance2() {
        // 第一次判断, 如果为空,去抢锁.
        if (instance == null) {
            synchronized (Singleton.class) {
                // 第二次判断,如果此时还为空(可能进入到此代码时,刚好上一个线程已经初始化过了), 则创建实例,否则什么也不做.
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * JVM在加载外部类的时候不会加载内部类, 只有在内部类的属性/方法被使用到时才会被加载,比较安全
     */
    private static class SingletonHolder{
        private static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance3() {
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.ENUM_SINGLETON;
        EnumSingleton singleton = EnumSingleton.ENUM_SINGLETON;
        System.out.println(enumSingleton == singleton);
    }

    // 防止序列化破坏单例
    public Object readResolve() {
        return instance;
    }
}

/**
 * 枚举创建单例
 * @author lqb
 * @date 2023/2/7
 */
enum EnumSingleton{
    ENUM_SINGLETON
}
