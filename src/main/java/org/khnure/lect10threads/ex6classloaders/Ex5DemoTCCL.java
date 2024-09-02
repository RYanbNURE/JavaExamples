package org.khnure.lect10threads.ex6classloaders;

import java.lang.reflect.Method;

// Використання TCCL для завантаження класу в іншій ієрархії завантажувачів
public class Ex5DemoTCCL {
    public static void main(String[] args) throws Exception {
        ClassLoader appClassLoader = Ex5DemoTCCL.class.getClassLoader();
        ClassLoader extClassLoader = appClassLoader.getParent();
        System.out.println("App ClassLoader: " + appClassLoader);
        System.out.println("Ext ClassLoader: " + extClassLoader);

        Class<?> clazz = Class.forName("HelloWorld", true, extClassLoader);
        Object instance = clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getMethod("sayHello");
        method.invoke(instance);
    }

}
