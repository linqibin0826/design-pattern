package com.linqibin.action;

import lombok.Data;

/**
 * 统一登陆结果ResultMsg类
 * @author lqb
 * @date 2022/4/27
 */
@Data
public class ResultMsg {

    private int code;
    private String msg;
    private Object data;

    public ResultMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}

