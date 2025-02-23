package org.khnure.lect6bcollectionextended.ex4unmodifiable.ex3map;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");

        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(map);
        System.out.println("Unmodifiable Map: " + unmodifiableMap);
    }
}
// Створення незмінної мапи. Якщо спробувати модифікувати її, виникне RuntimeException.