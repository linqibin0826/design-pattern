package com.linqibin.construct.build.extension;

import lombok.Data;

/**
 * 建造者模式拓展
 * @author lqb
 * @date 2023/2/9
 */
@Data
public class Phone {

    public Phone(PhoneBuilder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.motherBord = builder.motherBord;
    }

    private String cpu;

    private String screen;

    private String memory;

    private String motherBord;

    public static final class PhoneBuilder {

        private String cpu;

        private String screen;

        private String memory;

        private String motherBord;

        public PhoneBuilder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public PhoneBuilder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public PhoneBuilder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public PhoneBuilder motherBord(String val) {
            this.motherBord = val;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }

    }

    public static void main(String[] args) {
        Phone phone = new PhoneBuilder()
                .screen("大猩猩")
                .cpu("A100")
                .memory("100G")
                .motherBord("超大")
                .build();
        System.out.println(phone);
    }

}
