package com.linqibin.action;

/**
 * 适配器类
 * @author lqb
 * @date 2022/4/27
 */
public class PassportForThirdAdapter implements IPassportForThird {

    public ResultMsg loginForQQ(String openId) {
        return processLogin(openId, LoginForQQAdaptor.class);
    }

    private ResultMsg processLogin(String openId, Class<LoginForQQAdaptor> loginForQQAdaptorClass) {
        return new ResultMsg(200, "", "");
    }

    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelphone(String phone, String code) {
        return null;
    }
}
