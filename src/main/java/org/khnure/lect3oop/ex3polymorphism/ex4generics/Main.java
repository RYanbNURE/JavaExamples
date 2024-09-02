package org.khnure.lect3oop.ex3polymorphism.ex4generics;

// Головний клас, що містить метод main для запуску програми
public class Main {
    public static void main(String[] args) {
        // Створення екземпляру класу Cat
        Cat myCat = new Cat();

        // Виклик методу makeSound для об'єкта типу Cat
        myCat.makeSound();

        // Створення контейнера для типу Cat
        Box<Cat> catBox = new Box<>(new Cat());

        // Виклик методу getValue для контейнера з типом Cat
        Cat retrievedCat = catBox.getValue();

        // Виклик методу makeSound для отриманого об'єкта типу Cat
        retrievedCat.makeSound();
    }
}
