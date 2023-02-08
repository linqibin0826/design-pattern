package com.linqibin.prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
public class Citation implements Serializable {

    public Citation(Student student) {
        System.out.println("构造被调用");
        this.student = student;
    }

    private Student student;

    public void show() {
        System.out.println(student.getName() + "，获得本学期三好学生。");
    }
}
