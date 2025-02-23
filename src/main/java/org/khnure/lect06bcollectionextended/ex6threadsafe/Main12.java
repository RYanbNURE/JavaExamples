package org.khnure.lect06bcollectionextended.ex6threadsafe;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Main12 {
public static void main(String[] args) {
    ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
    deque.offerFirst("First");
    deque.offerLast("Last");
    System.out.println("Deque contents: " + deque);
}
}
// Використання ConcurrentLinkedDeque для потокобезпечних операцій з двосторонньою чергою.
