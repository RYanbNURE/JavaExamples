package org.khnure.lect10reflection.ex3;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<?> stringClass = String.class;

        // Get all methods of the String class
        Method[] methods = stringClass.getMethods();

        System.out.println("Methods of String:");
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}

// Українська: Цей приклад демонструє, як отримати всі методи класу String за допомогою методу getMethods().