package com.linqibin.Behavioral.state;

/**
 * 具体状态（Concrete  State）角色：实现抽象状态所对应的行为。
 *
 * @author lqb
 * @date 2023/2/19
 */
public class StartState implements State {


    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
