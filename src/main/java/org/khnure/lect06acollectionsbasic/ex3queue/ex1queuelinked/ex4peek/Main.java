package org.khnure.lect06acollectionsbasic.ex3queue.ex1queuelinked.ex4peek;

import java.util.LinkedList;
import java.util.Queue;

//Демонструє використання методу peek для отримання, але не видалення, головного елемента черги.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Element 1");
        queue.add("Element 2");

        System.out.println("Peeked element: " + queue.peek());
        System.out.println("Queue after peek: " + queue);
    }
}