package org.khnure.lect6acollectionsbasic.ex3queue.ex3arraydeque.ex2dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

//Пояснення: Демонструє використання методів Deque, addFirst і addLast з ArrayDeque.
public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addLast("Element 2");  // Adds element to the end
        deque.addFirst("Element 1"); // Adds element to the front
        System.out.println("ArrayDeque as Deque: " + deque);
    }
}