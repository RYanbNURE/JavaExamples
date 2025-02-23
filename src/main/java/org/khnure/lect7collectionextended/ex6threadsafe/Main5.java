package org.khnure.lect7collectionextended.ex6threadsafe;

import java.util.concurrent.ConcurrentHashMap;

public class Main5 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("Key", "Thread-safe");
        System.out.println("ConcurrentHashMap content: " + concurrentMap);
    }
}
// Використання ConcurrentHashMap для забезпечення високоефективної потокобезпеки.
