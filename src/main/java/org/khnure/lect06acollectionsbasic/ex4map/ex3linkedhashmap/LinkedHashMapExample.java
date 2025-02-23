package org.khnure.lect06acollectionsbasic.ex4map.ex3linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Демонстрація LinkedHashMap для збереження порядку вставки
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitals = new LinkedHashMap<>();

        // Додавання елементів
        capitals.put("Ukraine", "Kyiv");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");

        System.out.println("Порядок збережено: " + capitals);

        // Створення LinkedHashMap з обмеженим розміром та LRU порядком
        LinkedHashMap<Integer, String> lru = new LinkedHashMap<>(16, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > 3;
            }
        };

        lru.put(1, "one");
        lru.put(2, "two");
        lru.put(3, "three");
        System.out.println("LRU Least Recently Used кеш: " + lru);

        // Доступ до елемента змінює порядок
        lru.get(1);
        System.out.println("Після доступу до 1: " + lru);
    }
}