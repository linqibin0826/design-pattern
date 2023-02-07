package com.linqibin.interface_isolation.after;

/**
 * 符合接口隔离原则之后
 * @author lqb
 * @date 2023/2/7
 */
public class Demo {

    public static void main(String[] args) {
        HeimaSafetyDoor heimaSafetyDoor = new HeimaSafetyDoor();
        heimaSafetyDoor.waterProof();
        heimaSafetyDoor.fireProof();
        heimaSafetyDoor.antiTheft();

        System.out.println("======================");

        ItcastSafetyDoor safetyDoor = new ItcastSafetyDoor();
        safetyDoor.fireProof();
        safetyDoor.waterProof();
    }
}
