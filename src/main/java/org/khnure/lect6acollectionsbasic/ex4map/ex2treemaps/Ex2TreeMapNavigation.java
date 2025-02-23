package org.khnure.lect6acollectionsbasic.ex4map.ex2treemaps;

import java.util.TreeMap;

/**
 * Демонстрація методів навігації в TreeMap
 */
public class Ex2TreeMapNavigation {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(80, "Tom");
        scores.put(85, "Jerry");
        scores.put(90, "Mickey");
        scores.put(95, "Donald");

        // Отримання значень менших за ключ
        System.out.println("Оцінки нижче 90: " + scores.headMap(90));

        // Отримання значень більших за ключ
        System.out.println("Оцінки від 90 і вище: " + scores.tailMap(90));

        // Отримання значень у діапазоні
        System.out.println("Оцінки від 85 до 95: " + scores.subMap(85, 95));

        // Знаходження найближчих ключів
        System.out.println("Найближчий менший ключ до 87: " + scores.lowerKey(87));
        System.out.println("Найближчий більший ключ до 87: " + scores.higherKey(87));
    }
}
