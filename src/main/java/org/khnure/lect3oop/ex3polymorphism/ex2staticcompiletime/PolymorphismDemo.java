package org.khnure.lect3oop.ex3polymorphism.ex2staticcompiletime;

// Клас, який використовується для демонстрації статичного поліморфізму
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Виклик статичного методу з базового класу Animal, фактичний клас визначається на етапі компіляції

        Animal.displayInfo();

        // Створення об'єктів для Dog та Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Виклик статичного методу з підкласів, фактичний метод визначається на етапі компіляції
        dog.displayInfo();
        cat.displayInfo();
    }

}
