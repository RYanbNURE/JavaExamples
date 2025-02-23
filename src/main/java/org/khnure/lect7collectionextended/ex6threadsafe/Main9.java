package org.khnure.lect7collectionextended.ex6threadsafe;

import java.util.concurrent.CopyOnWriteArrayList;

public class Main9 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<>(new Integer[]{1, 2, 3});
        System.out.println("Initialized CopyOnWriteArrayList: " + cowList);
    }
}
// Ініціалізація потокобезпечного списку з масиву.