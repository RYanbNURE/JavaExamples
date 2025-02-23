package org.khnure.lect10reflection.ex6;

import java.lang.reflect.Field;

class Person {
    public String name = "John";
}

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            Field field = Person.class.getField("name");

            // Set the value of the field "name"
            field.set(person, "Jane");
            System.out.println("Updated Field Value: " + person.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Українська: Цей приклад демонструє, як встановити значення поля класу за допомогою методу set().
