package org.khnure.lect3oop.ex3polymorphism.ex2staticcompiletime;

// Підклас, який представляє собою Dog
public class Dog extends Animal {
    // Перевизначений статичний метод для виведення інформації про Dog
    public static void displayInfo() {
        System.out.println("Це пес.");
    }
}
