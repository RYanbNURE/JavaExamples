package org.khnure.lect5otherentities.ex4sealed;

// Головний клас для тестування нашої структури
public class Main {
    public static void main(String[] args) {
        // Створення об'єктів типу Animal, але використання підкласів через поліморфізм
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Виклик методу makeSound() для кожного з об'єктів
        dog.makeSound(); // Виведе: Woof!
        cat.makeSound(); // Виведе: Meow!
    }
}
