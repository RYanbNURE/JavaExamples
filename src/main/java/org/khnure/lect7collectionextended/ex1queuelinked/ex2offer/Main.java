package org.khnure.lect7collectionextended.ex1queuelinked.ex2offer;

import java.util.PriorityQueue;
import java.util.Queue;

//Пояснення: Демонструє використання методу offer для додавання елементів у чергу.
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(5);
        queue.offer(10);
        queue.offer(1);

        System.out.println("Queue after offer: " + queue);
    }
}