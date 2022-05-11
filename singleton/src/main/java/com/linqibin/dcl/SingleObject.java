package com.linqibin.dcl;

/**
 *
 * @author lqb
 * @date 2022/5/11
 */
public class SingleObject {

    private static volatile SingleObject singleObject;

    private SingleObject() {

    }

    public static SingleObject getInstance() {
        if (singleObject == null) {
            synchronized (SingleObject.class) {
                if (singleObject == null) {
                    return new SingleObject();
                }
            }
        }
        return singleObject;
    }

}
