package com.linqibin.action;

/**
 *
 * @author lqb
 * @date 2022/4/27
 */
public class LoginForQQAdaptor extends AbstractAdaptor {

    public boolean support(Object obj) {
        return obj instanceof LoginForQQAdaptor;
    }

    public ResultMsg login(String str, Object adapter) {
        if(!support(adapter)){return null;}
        //accesseToken
        //time
//        return super.loginForRegist(str,null);
        return null;
    }
}
