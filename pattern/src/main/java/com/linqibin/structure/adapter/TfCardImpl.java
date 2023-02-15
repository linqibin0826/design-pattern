package com.linqibin.structure.adapter;

public class TfCardImpl implements TfCard {
    @Override
    public String readTf() {
        return "Hello TF Read";
    }

    @Override
    public void writeTf() {
        System.out.println("往TF写入数据");
    }
}
