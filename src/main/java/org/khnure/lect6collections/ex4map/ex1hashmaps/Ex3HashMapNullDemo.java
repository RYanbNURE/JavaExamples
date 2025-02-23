package org.khnure.lect6collections.ex4map.ex1hashmaps;

import java.util.HashMap;

/**
 * Демонстрація роботи HashMap з null значеннями
 */
public class Ex3HashMapNullDemo {
    public static void main(String[] args) {
        HashMap<String, String> userEmails = new HashMap<>();

        // Додавання null значень
        userEmails.put("John", null);
        userEmails.put(null, "unknown@email.com");
        System.out.println("Мапа з null: " + userEmails);

        // Перевірка на null
        System.out.println("Email John: " + userEmails.get("John"));
        System.out.println("Email для null ключа: " + userEmails.get(null));

        // Безпечне отримання значення
        String email = userEmails.getOrDefault("Mary", "not found");
        System.out.println("Email Mary: " + email);
    }
}