package com.linqibin.structure.adapter;

public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.read(new SdCardImpl());
        System.out.println(msg);

        System.out.println("======================");
        // 使用该计算机读取TF卡的数据，但没有该接口。所以 需要用到适配器
        System.out.println(computer.read(new SdAdapter(new TfCardImpl())));

    }
}
