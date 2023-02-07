package com.linqibin.di.after;

import lombok.Data;

/**
 * 改进版，面向接口编程, 电脑接口无需修改，只需要用户传递进来的参数
 * @author lqb
 * @date 2023/2/7
 */
@Data
public class Computer {

    private Cpu cpu;

    private Disk disk;

    private Memory memory;

    public void run() {
        System.out.println("开机");
        disk.save();
        disk.get();
        cpu.run();
        memory.save();
    }

}
