package org.khnure.lect06acollectionsbasic.ex4map.ex1hashmaps;

import java.util.HashMap;

/**
 * Демонстрація налаштування продуктивності HashMap
 */
public class Ex4HashMapPerformance {
    public static void main(String[] args) {
        // Створення HashMap з початковою ємністю та коефіцієнтом завантаження
        HashMap<Integer, String> optimizedMap = new HashMap<>(100, 0.75f);

        long startTime = System.nanoTime();

        // Додавання елементів
        for (int i = 0; i < 75; i++) {
            optimizedMap.put(i, "Value" + i);
        }

        long endTime = System.nanoTime();
        System.out.println("Час додавання: " + (endTime - startTime) + " ns");
        System.out.println("Розмір мапи: " + optimizedMap.size());
    }
}