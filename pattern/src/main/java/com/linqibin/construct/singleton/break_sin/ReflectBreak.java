package com.linqibin.construct.singleton.break_sin;


import com.linqibin.construct.singleton.lazy.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射破坏单例
 * @author lqb
 * @date 2023/2/7
 */
public class ReflectBreak {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Singleton instance = Singleton.getInstance();

        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance1 = constructor.newInstance();
        System.out.println(instance1 == instance);
    }
}
