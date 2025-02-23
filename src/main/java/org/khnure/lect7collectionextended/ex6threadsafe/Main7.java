package org.khnure.lect7collectionextended.ex6threadsafe;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main7 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.offer("Thread-safe");
        System.out.println("ConcurrentLinkedQueue: " + queue);
    }
}
// Використання ConcurrentLinkedQueue для потокобезпечних операцій з чергою.