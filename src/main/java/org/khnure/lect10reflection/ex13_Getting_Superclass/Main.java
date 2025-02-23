package org.khnure.lect10reflection.ex13_Getting_Superclass;

public class Main {
    public static void main(String[] args) {
        Class<? super String> superclass = String.class.getSuperclass();

        // Print superclass name
        System.out.println("Superclass of String: " + superclass.getName());
    }
}

// Українська: Цей приклад демонструє, як отримати суперклас за допомогою методу getSuperclass().
