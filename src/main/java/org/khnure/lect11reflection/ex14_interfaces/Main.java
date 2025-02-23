package org.khnure.lect11reflection.ex14_interfaces;

public class Main {
    public static void main(String[] args) {
        // Get interfaces implemented by String class
        Class<?>[] interfaces = String.class.getInterfaces();

        System.out.println("Interfaces implemented by String:");
        for (Class<?> iface : interfaces) {
            System.out.println(iface.getName());
        }
    }
}

// Українська: Цей приклад демонструє, як отримати інтерфейси, що реалізуються класом, за допомогою методу getInterfaces().
