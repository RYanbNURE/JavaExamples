package org.khnure.lect7collectionextended.ex3arraydeque.ex2dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

//Пояснення: Демонструє використання методів Deque, addFirst і addLast з ArrayDeque.
public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Element 1"); // Adds element to the front
        deque.addLast("Element 2");  // Adds element to the end

        System.out.println("ArrayDeque as Deque: " + deque);
    }
}