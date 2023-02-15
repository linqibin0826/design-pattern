package com.linqibin.structure.adapter;

import lombok.AllArgsConstructor;

/**
 * 对象适配器模式（类适配器模式就是把聚合换成继承）
 * @author lqb
 * @date 2023/2/15
 */
@AllArgsConstructor
public class SdAdapter implements SdCard  {


    private TfCard tfCard;

    @Override
    public String readSd() {
        System.out.println("适配器从TF卡读取中");
        return tfCard.readTf();
    }

    @Override
    public void writeSd() {
        System.out.println("适配器正在写入数据到TF中");
        tfCard.writeTf();
    }
}
