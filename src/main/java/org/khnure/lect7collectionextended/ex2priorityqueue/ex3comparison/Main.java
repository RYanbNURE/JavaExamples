package org.khnure.lect7collectionextended.ex2priorityqueue.ex3comparison;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//Пояснення: Ілюструє відмінність у поведінці між LinkedList і PriorityQueue.
public class Main {
    public static void main(String[] args) {
        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(1);
        linkedList.add(3);

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);

        System.out.println("LinkedList as Queue: " + linkedList);
        System.out.println("PriorityQueue: " + priorityQueue);
    }
}