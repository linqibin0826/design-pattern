package com.linqibin.construct.prototype.shallow;

/**
 *
 * @author lqb
 * @date 2023/2/8
 */
public class CloneTest {

    public static void main(String[] args) {
        Citation citation = new Citation("林琪斌");
        citation.show();
        Citation clone = citation.clone();
        clone.setName("游美");
        clone.show();

        System.out.println(citation == clone);

    }
}
