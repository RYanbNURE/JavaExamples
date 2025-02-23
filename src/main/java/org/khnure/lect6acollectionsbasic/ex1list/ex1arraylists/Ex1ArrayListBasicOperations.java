package org.khnure.lect6acollectionsbasic.ex1list.ex1arraylists;

import java.util.ArrayList;

/**
 * Демонстрація створення ArrayList та базових операцій додавання
 */
public class Ex1ArrayListBasicOperations {
    public static void main(String[] args) {
        // Створення нового ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Додавання елементів
        System.out.println("Додавання елементів:");
        fruits.add("Apple");
        System.out.println("Після додавання Apple: " + fruits);

        fruits.add("Banana");
        System.out.println("Після додавання Banana: " + fruits);

        // Додавання елемента за індексом
        fruits.add(1, "Orange");
        System.out.println("Після додавання Orange на позицію 1: " + fruits);

        // Додавання кількох елементів
        fruits.addAll(java.util.Arrays.asList("Mango", "Grape"));
        System.out.println("Після додавання колекції: " + fruits);
    }
}
