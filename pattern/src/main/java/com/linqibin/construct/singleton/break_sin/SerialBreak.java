package com.linqibin.construct.singleton.break_sin;

import com.linqibin.construct.singleton.lazy.Singleton;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 序列化破坏单例模式, 以及如何解决该问题
 * @author lqb
 * @date 2023/2/7
 */
public class SerialBreak {

    // 出现了两个对象,说明单例被破坏了.
    public static void main(String[] args) {
//        writeObjectToFile();
        Singleton singleton = (Singleton) readObjectFromFile();

        // 由于Singleton中重写了readResolve()方法,  所以单例不会被序列化破坏了.
        System.out.println(Singleton.getInstance());
        System.out.println(singleton);
    }

    public static Object readObjectFromFile() {
        Object readObject;
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("E:\\a.txt")))) {
            readObject = ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return readObject;
    }

    public static void writeObjectToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\a.txt"))) {
            Singleton instance = Singleton.getInstance();
            oos.writeObject(instance);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
