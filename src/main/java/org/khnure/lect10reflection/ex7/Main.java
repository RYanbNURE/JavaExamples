package org.khnure.lect10reflection.ex7;

import java.lang.reflect.Method;

class Person {
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            Method method = Person.class.getMethod("greet", String.class);

            // Invoke method greet
            method.invoke(person, "World");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Українська: Цей приклад демонструє, як викликати метод за допомогою методу invoke().