package org.khnure.lect6acollectionsbasic.ex4map.ex3linkedhashmap;

import java.util.LinkedHashMap;

/**
 * Демонстрація LinkedHashMap з порядком доступу
 */
public class Ex2AccessOrderLinkedHashMap {
    public static void main(String[] args) {
        // Створення LinkedHashMap з порядком доступу
        LinkedHashMap<String, String> cache = new LinkedHashMap<>(16, 0.75f, true);

        // Додавання елементів
        cache.put("A", "Value A");
        cache.put("B", "Value B");
        cache.put("C", "Value C");
        System.out.println("Початковий порядок: " + cache);

        // Доступ до елементів змінює їх порядок
        cache.get("A");
        System.out.println("Після доступу до A: " + cache);

        cache.get("B");
        System.out.println("Після доступу до B: " + cache);

        // Додавання нового елемента
        cache.put("D", "Value D");
        System.out.println("Після додавання D: " + cache);
    }
}