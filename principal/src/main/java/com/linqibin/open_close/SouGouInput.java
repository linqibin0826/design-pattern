package com.linqibin.open_close;


/**
 * 搜狗输入法皮肤例子
 * @author lqb
 * @date 2023/2/6
 */
public class SouGouInput {

    AbstractSkin skin;

    public AbstractSkin getSkin() {
        return skin;
    }

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
