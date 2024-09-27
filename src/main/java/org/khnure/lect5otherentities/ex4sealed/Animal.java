package org.khnure.lect5otherentities.ex4sealed;

// Абстрактний клас Animal з абстрактним методом makeSound()
public abstract sealed class Animal permits Cat, Dog, Monkey {
    // Абстрактний метод, який повинен бути реалізований у підкласах
    abstract void makeSound();
}
