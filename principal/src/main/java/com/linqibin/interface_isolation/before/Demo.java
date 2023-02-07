package com.linqibin.interface_isolation.before;

/**
 * 如果此时想再添加一个传智安全门, 但只有防水和防火的功能.  因此不能去实现SafetyDoor,  不符合接口隔离原则.
 * 优化后代码见after包
 * @author lqb
 * @date 2023/2/7
 */
public class Demo {

    public static void main(String[] args) {
        SafetyDoor safetyDoor = new HeimaSafetyDoor();
        safetyDoor.antiTheft();
        safetyDoor.waterProof();
        safetyDoor.fireProof();

    }
}
