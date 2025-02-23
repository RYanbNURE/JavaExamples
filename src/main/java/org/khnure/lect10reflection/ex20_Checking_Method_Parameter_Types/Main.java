package org.khnure.lect10reflection.ex20_Checking_Method_Parameter_Types;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Method method = String.class.getMethod("substring", int.class, int.class);
            Class<?>[] parameterTypes = method.getParameterTypes();

            System.out.println("Parameter Types of substring:");
            for (Class<?> paramType : parameterTypes) {
                System.out.println(paramType.getName());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

// Українська: Цей приклад демонструє, як отримати типи параметрів методу за допомогою рефлексії.