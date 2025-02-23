package org.khnure.lect7collectionextended.ex2sets.ex3linkedhashset;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        // Creating a LinkedHashSet to maintain the insertion order of elements
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        System.out.println("LinkedHashSet preserves insertion order: " + linkedHashSet);
    }
}
// Використання LinkedHashSet для збереження порядку вставки елементів.
