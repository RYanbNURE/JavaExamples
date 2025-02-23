package org.khnure.lect10reflection.ex8;

import java.lang.reflect.Constructor;

class Person {
    public Person() {
        System.out.println("Person Constructor Called");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Create an instance of Person using reflection
            Constructor<Person> constructor = Person.class.getConstructor();
            Person person = constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Українська: Цей приклад демонструє, як створити екземпляр класу за допомогою конструктора через рефлексію.
