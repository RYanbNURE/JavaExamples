package org.khnure.lect7collectionextended.ex5singleelemcollections.ex3singlemap;

import java.util.Collections;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> singleItemMap = Collections.singletonMap("Key", "Value");
        System.out.println("Single element map contains: " + singleItemMap);
    }
}
// Створення мапи з однією парою ключ-значення. Мапа є незмінною.