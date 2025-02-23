package org.khnure.lect11reflection.ex2;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> stringClass = String.class;

            // Get all constructors of the String class
            Constructor<?>[] constructors = stringClass.getConstructors();

            System.out.println("Constructors of String:");
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Українська: Цей приклад демонструє, як отримати всі конструктори класу String за допомогою методу getConstructors().
