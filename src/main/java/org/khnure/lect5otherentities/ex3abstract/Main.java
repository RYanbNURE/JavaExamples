package org.khnure.lect5otherentities.ex3abstract;

// Головний клас для тестування нашої структури
public class Main {
    public static void main(String[] args) {
        // Створення об'єктів типу Animal, але використання підкласів через поліморфізм
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Виклик методу makeSound() для кожного з об'єктів
        dog.makeSound(); // Виведе: Woof!
        cat.makeSound(); // Виведе: Meow!

        // Виклик default методу describeSound(), реалізованого через інтерфейс SoundMaker
        dog.describeSound(); // Виведе: Produces a unique sound.
        cat.describeSound(); // Виведе: Produces a unique sound.

        // Виклик абстрактного методу action() для кожного з об'єктів
        dog.action(); // Виведе: Dog runs.
        cat.action(); // Виведе: Cat jumps.
    }
}
