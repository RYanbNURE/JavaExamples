package org.khnure.lect10reflection.ex4;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Class<?> stringClass = String.class;

        // Get all fields of the String class
        Field[] fields = stringClass.getDeclaredFields();

        System.out.println("Fields of String:");
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}

// Українська: Цей приклад демонструє, як отримати всі поля класу String за допомогою методу getDeclaredFields().