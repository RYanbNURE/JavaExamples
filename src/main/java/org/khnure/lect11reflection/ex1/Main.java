package org.khnure.lect11reflection.ex1;

public class Main {
    public static void main(String[] args) {
        try {
            // Obtain the Class object for String
            Class<?> stringClass = Class.forName("java.lang.String");

            // Print class name
            System.out.println("Class Name: " + stringClass.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// Українська: Цей приклад демонструє, як отримати об'єкт класу для класу String за допомогою методу Class.forName().
