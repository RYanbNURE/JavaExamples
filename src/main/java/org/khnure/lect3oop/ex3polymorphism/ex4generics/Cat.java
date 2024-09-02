package org.khnure.lect3oop.ex3polymorphism.ex4generics;

// Клас Cat, що успадковує від Animal
public class Cat extends Animal{
    // Перевизначення методу makeSound для кота
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
