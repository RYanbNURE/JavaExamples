package org.khnure.lect3oop.ex3polymorphism.ex1override;

// Підклас, який представляє собою Cat
public class Cat extends Animal {
    // Перевизначений метод для виведення інформації про Cat
    public void displayInfo() {
        System.out.println("Це кіт.");
    }
}
