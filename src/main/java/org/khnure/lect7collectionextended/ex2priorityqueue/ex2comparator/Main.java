package org.khnure.lect7collectionextended.ex2priorityqueue.ex2comparator;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//Пояснення: Демонструє PriorityQueue з користувацьким компаратором для зворотного порядку.
public class Main {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);

        System.out.println("PriorityQueue with custom comparator: " + priorityQueue);
    }
}
