package org.khnure.lect6acollectionsbasic.ex4map.ex2treemaps;

import java.util.TreeMap;

/**
 * Демонстрація використання TreeMap для сортування ключів
 */
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Double> grades = new TreeMap<>();

        // Додавання елементів (автоматично сортуються за ключем)
        grades.put("Charlie", 85.5);
        grades.put("Alice", 90.0);
        grades.put("Bob", 88.5);

        System.out.println("Відсортовані оцінки: " + grades);

        // Отримання першого і останнього ключів
        String firstStudent = grades.firstKey();
        String lastStudent = grades.lastKey();

        System.out.println("Перший студент: " + firstStudent);
        System.out.println("Останній студент: " + lastStudent);

        // Отримання частини мапи
        System.out.println("Студенти від A до C: " +
                grades.subMap("A", "D"));
    }
}