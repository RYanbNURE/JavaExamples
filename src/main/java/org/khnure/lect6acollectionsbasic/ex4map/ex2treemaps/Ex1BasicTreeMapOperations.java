package org.khnure.lect6acollectionsbasic.ex4map.ex2treemaps;

import java.util.TreeMap;

/**
 * Демонстрація базових операцій з TreeMap
 */
public class Ex1BasicTreeMapOperations {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Додавання елементів (автоматично сортуються за ключем)
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        System.out.println("Відсортована мапа: " + treeMap);

        // Отримання першого та останнього ключа
        System.out.println("Перший ключ: " + treeMap.firstKey());
        System.out.println("Останній ключ: " + treeMap.lastKey());

        // Отримання першого та останнього запису
        System.out.println("Перший запис: " + treeMap.firstEntry());
        System.out.println("Останній запис: " + treeMap.lastEntry());
    }
}
