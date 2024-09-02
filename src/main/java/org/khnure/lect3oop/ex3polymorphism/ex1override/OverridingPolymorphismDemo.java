package org.khnure.lect3oop.ex3polymorphism.ex1override;

public class OverridingPolymorphismDemo {
    public static void main(String[] args) {
        // Створення об'єктів для Dog та Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Виклик методу displayInfo() через посилання на базовий клас, фактичний метод визначається на етапі виконання
        dog.displayInfo();
        cat.displayInfo();
    }
}
