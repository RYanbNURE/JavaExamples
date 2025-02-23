package org.khnure.lect05otherentities.ex3abstract;

// Абстрактний клас Animal з методом action()
public abstract class Animal implements SoundMaker {
    // Абстрактний метод, який повинен бути реалізований у підкласах
    abstract void action();

    @Override
    public void makeSound() { // Реалізація методу makeSound() з інтерфейсу SoundMaker
        System.out.println("Woof!");
    }
}
