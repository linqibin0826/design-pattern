package com.linqibin.demo2;

/**
 * @author lqb
 * @date 2022/5/11
 */
public class Computer {

    private String cpu;
    private String screen;
    private String motherboard;
    private String memory;

    private Computer(PhoneBuilder builder) {
        cpu = builder.cpu;
        screen = builder.screen;
        motherboard = builder.motherboard;
        memory = builder.memory;
    }

    public static final class PhoneBuilder {

        private String cpu;
        private String screen;
        private String motherboard;
        private String memory;

        public PhoneBuilder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public PhoneBuilder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public PhoneBuilder motherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public PhoneBuilder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
