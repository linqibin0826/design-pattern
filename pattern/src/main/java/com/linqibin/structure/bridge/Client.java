package com.linqibin.structure.bridge;


public class Client {
    public static void main(String[] args) {
        new MacOS(new AviFile()).play("战狼3");
        new WindowsOS(new REVBFile()).play("流浪地球3");
    }
}
