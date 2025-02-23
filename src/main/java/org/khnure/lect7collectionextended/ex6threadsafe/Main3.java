package org.khnure.lect7collectionextended.ex6threadsafe;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Main3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map<String, String> syncMap = Collections.synchronizedMap(map);
        syncMap.put("key", "Thread-safe");
        System.out.println("Added to thread-safe map: " + syncMap);
    }
}
// Створення потокобезпечної мапи за допомогою Collections.synchronizedMap.