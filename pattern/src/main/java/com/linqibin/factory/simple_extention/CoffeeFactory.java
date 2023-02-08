package com.linqibin.factory.simple_extention;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 静态工厂模式+配置文件方式，对其进行解耦
 *
 * @author lqb
 * @date 2023/2/8
 */
public class CoffeeFactory {

    private static Map<String, Coffee> factory = new HashMap<>();

    static {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("bean.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            properties.keySet().forEach(key -> {
                String cls = (String) properties.get(key);
                try {
                    Coffee coffee = (Coffee) classLoader.loadClass(cls).newInstance();
                    factory.put((String) key, coffee);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 客户端根据需求，创建自己需要的对象。
     * @param args
     */
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.factory.get("latte");
        System.out.println(coffee.getName());
    }
}
