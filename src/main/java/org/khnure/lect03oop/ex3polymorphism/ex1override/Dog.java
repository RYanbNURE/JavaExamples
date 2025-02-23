package org.khnure.lect03oop.ex3polymorphism.ex1override;

public class Dog extends Animal {
    // Перевизначений метод для виведення інформації про Dog
    public void displayInfo() {
        System.out.println("Це пес.");
    }
}
