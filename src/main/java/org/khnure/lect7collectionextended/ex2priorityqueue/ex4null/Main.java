package org.khnure.lect7collectionextended.ex2priorityqueue.ex4null;

import java.util.PriorityQueue;
import java.util.Queue;

//Пояснення: Показує, що додання null до PriorityQueue викликатиме NullPointerException.

public class Main {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        try {
            priorityQueue.add(null); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Cannot add null to PriorityQueue");
        }
    }
}