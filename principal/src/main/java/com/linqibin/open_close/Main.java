package com.linqibin.open_close;


/**
 * 符合软件设计的开闭远程,  在需要新皮肤的时候,  只需再添加类即可.
 * @author lqb
 * @date 2023/2/6
 */
public class Main {

    public static void main(String[] args) {

        // 1.创建搜狗输入法
        SouGouInput input = new SouGouInput();
        // 2.创建皮肤
//        AbstractSkin skin = new DefaultSkinImpl();
        AbstractSkin skin = new HeimaSkinImpl();
        input.setSkin(skin);

        // 3. 显示输入法
        input.display();
    }
}