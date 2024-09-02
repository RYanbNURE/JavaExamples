package org.khnure.lect10threads.ex4reflection;

import java.lang.reflect.Method;

//This class demonstrates how to use reflection to invoke methods dynamically at runtime.
public class Ex2InvokeMethods {
    public void greet() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("InvokeMethods");
        Object instance = clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getMethod("greet");
        method.invoke(instance);
    }

}
