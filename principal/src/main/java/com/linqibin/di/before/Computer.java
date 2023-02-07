package com.linqibin.di.before;

import lombok.Data;

/**
 * 违反了依赖倒转原则，没有面向抽象编程。
 * 也违反了开闭原则， 如果有需要别的品牌的设备，需要修改代码。
 * @author lqb
 * @date 2023/2/7
 */
@Data
public class Computer {

    private Intel cpu;

    private XiJieDisk disk;

    private KingstonMemory memory;

    public void run() {
        System.out.println("开机");
        disk.save();
        disk.get();
        cpu.run();
        memory.save();
    }

}
