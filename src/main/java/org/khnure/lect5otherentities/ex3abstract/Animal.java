package org.khnure.lect5otherentities.ex3abstract;

import java.util.List;

// Абстрактний клас Animal з методом action()
public abstract class Animal implements SoundMaker {
    // Абстрактний метод, який повинен бути реалізований у підкласах
    abstract void action();

    @Override
    public void makeSound() { // Реалізація методу makeSound() з інтерфейсу SoundMaker
        System.out.println("Woof!");
    }
}
