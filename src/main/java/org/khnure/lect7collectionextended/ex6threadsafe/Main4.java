package org.khnure.lect7collectionextended.ex6threadsafe;

import java.util.concurrent.CopyOnWriteArrayList;

public class Main4 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<>();
        cowList.add("Thread-safe");
        System.out.println("CopyOnWriteArrayList: " + cowList);
    }
}
// Використання CopyOnWriteArrayList для забезпечення потокобезпеки при частих змінах.
