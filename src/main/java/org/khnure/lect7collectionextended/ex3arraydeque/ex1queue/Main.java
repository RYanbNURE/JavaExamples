package org.khnure.lect7collectionextended.ex3arraydeque.ex1queue;

import java.util.ArrayDeque;
import java.util.Queue;

//Пояснення: Демонструє використання ArrayDeque як черги.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        System.out.println("ArrayDeque as Queue: " + queue);
    }
}