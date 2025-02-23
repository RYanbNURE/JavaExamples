package org.khnure.lect06bcollectionextended.ex6threadsafe;

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> syncSet = Collections.synchronizedSet(set);
        syncSet.add("Thread-safe");
        System.out.println("Added to thread-safe set: " + syncSet);
    }
}
// Створення потокобезпечної множини за допомогою Collections.synchronizedSet.