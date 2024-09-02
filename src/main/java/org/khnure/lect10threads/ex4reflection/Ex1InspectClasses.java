package org.khnure.lect10threads.ex4reflection;

import java.lang.reflect.Method;

// Клас для демонстрації використання рефлексії для інспектування класів
public class Ex1InspectClasses {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            System.out.println("Клас: " + clazz.getName());
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Метод: " + method.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
