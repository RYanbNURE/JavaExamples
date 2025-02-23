package org.khnure.lect10reflection.ex9;

import java.lang.reflect.Field;

class Person {
    private String name = "John";
}

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            Field field = Person.class.getDeclaredField("name");

            // Make private field accessible
            field.setAccessible(true);

            // Get and print private field value
            Object value = field.get(person);
            System.out.println("Private Field Value: " + value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Українська: Цей приклад демонструє, як отримати значення приватного поля за допомогою методу setAccessible(true).
