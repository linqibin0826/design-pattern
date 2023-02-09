package com.linqibin.construct.singleton.hungry;

/**
 *
 * 在类初始化的时候就已经加载了
 * @author lqb
 * @date 2023/2/7
 */
public class Singleton {

    // 1.构造器私有化
    private Singleton() {

    }

    // 2. 声明变量
    private static final Singleton instance = new Singleton();

    // 3. 提供全局唯一的访问入口
    public Singleton getInstance() {
        return instance;
    }
}
