package org.khnure.lect7collectionextended.ex2priorityqueue.ex1adding;

import java.util.PriorityQueue;
import java.util.Queue;

//Пояснення: Показує, як елементи зберігаються в PriorityQueue за їх природним порядком.
public class Main {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);

        System.out.println("PriorityQueue: " + priorityQueue);
    }
}