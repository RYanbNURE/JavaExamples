package org.khnure.lect03oop.ex3polymorphism.ex2staticcompiletime;

// Базовий клас з методом, який буде перевизначатися в підкласах
public class Animal {
    // Статичний метод для виведення інформації про тварину
    public static void displayInfo() {
        System.out.println("Це тварина.");
    }
}
