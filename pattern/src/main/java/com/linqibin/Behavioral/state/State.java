package com.linqibin.Behavioral.state;

/**
 * 抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为。
 *
 * @author lqb
 * @date 2023/2/19
 */
public interface State {

    void doAction(Context context);
}
