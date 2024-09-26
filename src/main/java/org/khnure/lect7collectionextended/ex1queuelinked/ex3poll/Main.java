package org.khnure.lect7collectionextended.ex1queuelinked.ex3poll;

import java.util.LinkedList;
import java.util.Queue;

//Пояснення: Демонструє використання методу poll для отримання та видалення головного елемента черги.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Element 1");
        queue.add("Element 2");

        System.out.println("Removed element: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}