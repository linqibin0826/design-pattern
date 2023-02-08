package com.linqibin.prototype.shallow;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author lqb
 * @date 2023/2/8
 */
@Data
@AllArgsConstructor
public class Citation implements Cloneable {

    private String name;

    public void show() {
        System.out.println(name + "，获得本学期三好学生。");
    }

    @Override
    public Citation clone() {
        try {
            Citation clone = (Citation) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
