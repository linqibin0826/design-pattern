package com.linqibin.Behavioral.responsibility;

public class Manager extends Handler {
    public Manager() {
        //小组长处理1-3天的请假
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    public void handleLeave(Leave leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天.");
        System.out.println("部门经理审批：同意。");
    }
}
