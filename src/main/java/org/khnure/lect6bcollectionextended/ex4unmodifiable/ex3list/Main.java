package org.khnure.lect6bcollectionextended.ex4unmodifiable.ex3list;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> unmodifiableList = List.of("Hello", "World");
        System.out.println("Unmodifiable List using List.of: " + unmodifiableList);
        unmodifiableList.add("Test");
    }
}
// Використання List.of() для створення незмінного списку. Цей метод з Java 9 не дозволяє зміни в списку.