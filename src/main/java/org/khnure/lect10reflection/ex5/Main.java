package org.khnure.lect10reflection.ex5;

import java.lang.reflect.Field;

class Person {
    public String name = "John";
}

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            Field field = Person.class.getField("name");

            // Get value of the field "name"
            Object value = field.get(person);
            System.out.println("Field Value: " + value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Українська: Цей приклад демонструє, як отримати значення поля класу за допомогою методу get().
