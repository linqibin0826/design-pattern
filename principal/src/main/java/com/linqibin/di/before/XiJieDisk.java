package com.linqibin.di.before;

/**
 *
 * @author lqb
 * @date 2023/2/7
 */
public class XiJieDisk {

    public void save() {
        System.out.println("往希捷硬盘保存数据");
    }

    public String get() {
        return "从希捷硬盘读取数据";
    }
}
