package com.linqibin.Behavioral.responsibility;

public class GeneralManager extends Handler {
    public GeneralManager() {
        //经理处理7天以上的请假
        super(Handler.NUM_SEVEN);
    }

    @Override
    public void handleLeave(Leave leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天.");
        System.out.println("总经理审批：同意。");
    }
}
