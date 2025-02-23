package org.khnure.lect03oop.ex3polymorphism.ex2staticcompiletime;

// Підклас, який представляє собою Cat
public class Cat extends Animal {
    // Перевизначений статичний метод для виведення інформації про Cat
    public static void displayInfo() {
        System.out.println("Це кіт.");
    }
}
