package com.linqibin.Behavioral.responsibility;

/**
 * @author lqb
 * @date 2023/2/18
 */
public class Leave {

    private int num;

    private String name;

    public Leave(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
