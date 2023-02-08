package com.linqibin.prototype.deep;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Citation citation = new Citation(new Student("林琪斌"));
        // 通过序列化实现深度克隆
        Citation readObject = getCitation(citation);
        readObject.getStudent().setName("游美");

        readObject.show();
        citation.show();
    }

    private static <T> T getCitation(T t) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(t);
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        return (T) objectInputStream.readObject();
    }
}
