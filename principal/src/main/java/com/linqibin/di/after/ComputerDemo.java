package com.linqibin.di.after;

public class ComputerDemo {


    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu(new Intel());
        computer.setMemory(new KingstonMemory());
        computer.setDisk(new XiJieDisk());
        computer.run();
    }
}
