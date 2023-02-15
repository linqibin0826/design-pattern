package com.linqibin.structure.adapter;

public class SdCardImpl implements SdCard {
    @Override
    public String readSd() {
        return "Hello world SD READ";
    }

    @Override
    public void writeSd() {
        System.out.println("往SD卡写入数据");
    }
}
