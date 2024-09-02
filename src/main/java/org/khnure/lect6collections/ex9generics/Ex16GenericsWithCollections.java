package org.khnure.lect6collections.ex9generics;

import java.util.HashMap;
import java.util.Map;

public class Ex16GenericsWithCollections {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1); // Додавання до колекції
        map.put("Two", 2);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()); // Друкуємо елементи колекції
        }
    }
}
