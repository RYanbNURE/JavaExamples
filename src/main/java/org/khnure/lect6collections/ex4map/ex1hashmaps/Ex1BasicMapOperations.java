package org.khnure.lect6collections.ex4map.ex1hashmaps;

import java.util.HashMap;
import java.util.Map;

/**
 * Демонстрація базових операцій з HashMap
 */
public class Ex1BasicMapOperations {
    public static void main(String[] args) {
        // Створення нової HashMap
        Map<String, Integer> ages = new HashMap<>();

        // Додавання елементів
        ages.put("John", 25);
        System.out.println("Додано John: " + ages);

        // Отримання значення
        Integer johnsAge = ages.get("John");
        System.out.println("Вік John: " + johnsAge);

        // Перевірка наявності ключа
        boolean hasJohn = ages.containsKey("John");
        System.out.println("Чи є John у мапі: " + hasJohn);

        // Видалення елемента
        ages.remove("John");
        System.out.println("Після видалення John: " + ages);
    }
}
