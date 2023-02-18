package com.linqibin.Behavioral.responsibility;

/**
 * 抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 *
 * @author lqb
 * @date 2023/2/18
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    private final int numStart;

    private int numEnd;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleLeave(Leave leave);

    public void submit(Leave leave) {
        if (0 == this.numStart) {
            return;
        }

        //如果请假天数达到该领导者的处理要求
        if (leave.getNum() >= this.numStart) {
            this.handleLeave(leave);

            //如果还有上级 并且请假天数超过了当前领导的处理范围
            if (null != this.nextHandler && leave.getNum() > numEnd) {
                this.nextHandler.submit(leave);//继续提交
            } else {
                System.out.println("流程结束");
            }
        }
    }
}
