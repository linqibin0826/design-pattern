package com.linqibin.structure.facade;

public class Client {

    public static void main(String[] args) {
        SmartApplicationFacade facade = new SmartApplicationFacade();
        facade.on();
        System.out.println("============");
        facade.off();
    }
}
