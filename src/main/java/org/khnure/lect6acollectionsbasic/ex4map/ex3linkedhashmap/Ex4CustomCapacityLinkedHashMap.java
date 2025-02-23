package org.khnure.lect6acollectionsbasic.ex4map.ex3linkedhashmap;

import java.util.LinkedHashMap;

/**
 * Демонстрація налаштування початкової ємності LinkedHashMap
 */
public class Ex4CustomCapacityLinkedHashMap {
    public static void main(String[] args) {
        // Створення LinkedHashMap з власною початковою ємністю та коефіцієнтом завантаження
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(32, 0.75f);

        long startTime = System.nanoTime();

        // Додавання елементів
        for (int i = 0; i < 25; i++) {
            map.put("Key" + i, i);
            System.out.println("Додано Key" + i + ": " + i);
        }

        long endTime = System.nanoTime();
        System.out.println("Час виконання: " + (endTime - startTime) + " ns");
        System.out.println("Фінальний розмір: " + map.size());
        System.out.println("Порядок збережено: " + map);
    }
}
