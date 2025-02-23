package org.khnure.lect10reflection.ex19_Checking_Method_Return_Type;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Method method = String.class.getMethod("substring", int.class);
            Class<?> returnType = method.getReturnType();

            // Print method return type
            System.out.println("Return Type of substring: " + returnType.getName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

// Українська: Цей приклад демонструє, як отримати тип повернення методу за допомогою рефлексії.
