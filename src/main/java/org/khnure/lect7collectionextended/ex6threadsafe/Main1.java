package org.khnure.lect7collectionextended.ex6threadsafe;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> syncList = Collections.synchronizedList(list);
        syncList.add("Thread-safe");
        System.out.println("Added to thread-safe list: " + syncList);
    }
}
// Створення потокобезпечного списку за допомогою Collections.synchronizedList.
