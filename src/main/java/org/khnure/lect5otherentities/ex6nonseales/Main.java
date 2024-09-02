package org.khnure.lect5otherentities.ex6nonseales;

public class Main {
    public static void main(String[] args) {
        // Створення екземпляра несеалайзованого підкласу
        NonSealedSubclass nonSealedSubclass = new NonSealedSubclass(10, 20);

        // Виведення значень для перевірки
        System.out.println("Base Value: " + nonSealedSubclass.getBaseValue());
        System.out.println("Subclass Value: " + nonSealedSubclass.getSubclassValue());

        // Створення екземпляра іншого несеалайзованого класу
        AnotherNonSealedClass anotherNonSealedClass = new AnotherNonSealedClass(30, 40);

        // Виведення значень для перевірки
        System.out.println("Base Value: " + anotherNonSealedClass.getBaseValue());
        System.out.println("Another Subclass Value: " + anotherNonSealedClass.getAnotherSubclassValue());
    }

}
