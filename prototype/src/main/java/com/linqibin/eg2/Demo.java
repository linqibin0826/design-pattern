package com.linqibin.eg2;

public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Citation clone1 = citation.clone();
        Citation clone2 = citation.clone();

        clone1.getStudent().setName("LQB");
        clone2.getStudent().setName("YM");
        clone1.show();
        clone2.show();

    }
}
