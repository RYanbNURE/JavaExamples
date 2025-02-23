package org.khnure.lect6acollectionsbasic.ex4map.ex3linkedhashmap;

import java.util.LinkedHashMap;

/**
 * Демонстрація базових операцій LinkedHashMap із збереженням порядку вставки
 */
public class Ex1BasicLinkedHashMapDemo {
    public static void main(String[] args) {
        // Створення LinkedHashMap
        LinkedHashMap<String, Integer> orderMap = new LinkedHashMap<>();

        // Додавання елементів
        System.out.println("Додавання елементів у порядку:");
        orderMap.put("First", 1);
        System.out.println("Після додавання First: " + orderMap);

        orderMap.put("Second", 2);
        System.out.println("Після додавання Second: " + orderMap);

        orderMap.put("Third", 3);
        System.out.println("Після додавання Third: " + orderMap);

        // Отримання значення
        System.out.println("Значення для 'Second': " + orderMap.get("Second"));

        // Видалення і додавання знову - буде в кінці
        orderMap.remove("First");
        orderMap.put("First", 1);
        System.out.println("Після переміщення First: " + orderMap);
    }
}