package org.khnure.lect6acollectionsbasic.ex3queue.ex2priorityqueue.ex4null;

import java.util.*;

//Пояснення: Показує, що додання null до PriorityQueue викликатиме NullPointerException.

public class Main {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        try {
            priorityQueue.add(null); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Cannot add null to PriorityQueue");
        }

        Map<String, String> map = new TreeMap<>();

        map.put(null, "A");
        map.put(null, "B");
        map.put(null, "C");

        System.out.println(map.get(null));
    }
}