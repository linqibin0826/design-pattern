package com.linqibin.eg2;

/**
 * 原型模式--深克隆
 * @author lqb
 * @date 2022/5/11
 */
public class Citation implements Cloneable{

    private Student student = new Student();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        // 要实现深克隆, 必须将类中的每个引用类型,都手动克隆后赋值..
        // 或者采用序列化形式 进行深克隆...

        Citation clone = (Citation) super.clone();
        clone.student = student.clone();
        return clone;
    }

    public void show() {
        System.out.println(student.getName() + "同学被评为三好学生!");
    }
}
