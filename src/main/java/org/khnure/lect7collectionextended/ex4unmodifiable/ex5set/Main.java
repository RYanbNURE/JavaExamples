package org.khnure.lect7collectionextended.ex4unmodifiable.ex5set;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> unmodifiableSet = Set.of("Apple", "Banana");
        System.out.println("Unmodifiable Set using Set.of: " + unmodifiableSet);
    }
}
// Використання Set.of() для створення незмінного набору. Цей метод також запроваджений в Java 9.
