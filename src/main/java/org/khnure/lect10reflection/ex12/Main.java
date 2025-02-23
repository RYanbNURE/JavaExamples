package org.khnure.lect10reflection.ex12;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        // Create an int array using reflection
        int[] array = (int[]) Array.newInstance(int.class, 5);

        // Set values using reflection
        Array.set(array, 0, 10);
        Array.set(array, 1, 20);

        // Get and print values using reflection
        System.out.println("Value at index 0: " + Array.get(array, 0));
        System.out.println("Value at index 1: " + Array.get(array, 1));
    }
}

// Українська: Цей приклад демонструє, як працювати з масивами за допомогою рефлексії.