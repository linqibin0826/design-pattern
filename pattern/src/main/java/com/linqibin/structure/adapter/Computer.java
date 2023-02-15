package com.linqibin.structure.adapter;

/**
 * 电脑
 *
 * @author lqb
 * @date 2023/2/15
 */
public class Computer {

    public String read(SdCard sdCard) {
        return sdCard.readSd();
    }

}
