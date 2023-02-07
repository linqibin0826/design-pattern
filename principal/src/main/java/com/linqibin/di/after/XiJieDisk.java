package com.linqibin.di.after;

/**
 *
 * @author lqb
 * @date 2023/2/7
 */
public class XiJieDisk implements Disk {

    public void save() {
        System.out.println("往希捷硬盘保存数据");
    }

    public String get() {
        return "从希捷硬盘读取数据";
    }
}
