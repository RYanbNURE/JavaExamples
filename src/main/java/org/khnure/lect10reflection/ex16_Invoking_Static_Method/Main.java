package org.khnure.lect10reflection.ex16_Invoking_Static_Method;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Method method = Math.class.getMethod("sqrt", double.class);

            // Invoke static method Math.sqrt()
            double result = (double) method.invoke(null, 16);
            System.out.println("Result of Math.sqrt(16): " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Українська: Цей приклад демонструє, як викликати статичний метод за допомогою рефлексії.