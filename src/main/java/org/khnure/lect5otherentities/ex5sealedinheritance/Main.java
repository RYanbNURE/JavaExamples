package org.khnure.lect5otherentities.ex5sealedinheritance;

// Головний клас для тестування
public class Main {
    public static void main(String[] args) {
        // Створення екземпляра дочірнього класу
        SealedChild sealedChild = new SealedChild(10, 20, 30);

        // Виведення значень для перевірки
        System.out.println("Base Value: " + sealedChild.getBaseValue());
        System.out.println("Subclass Value: " + sealedChild.getSubclassValue());
        System.out.println("Child Value: " + sealedChild.getChildValue());
    }
}
