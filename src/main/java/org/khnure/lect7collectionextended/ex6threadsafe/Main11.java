package org.khnure.lect7collectionextended.ex6threadsafe;

import java.util.concurrent.ConcurrentHashMap;

public class Main11 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("thread", 1);
        map.compute("thread", (key, val) -> val != null ? val + 1 : 1);
        System.out.println("Updated value: " + map.get("thread"));
    }
}
// Використання ConcurrentHashMap для конкурентної маніпуляції данними.
