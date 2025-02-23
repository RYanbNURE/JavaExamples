package org.khnure.lect7collectionextended.ex6threadsafe;

import java.util.concurrent.PriorityBlockingQueue;

public class Main8 {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> pbQueue = new PriorityBlockingQueue<>();
        pbQueue.add("Priority");
        System.out.println("PriorityBlockingQueue: " + pbQueue);
    }
}
// Використання PriorityBlockingQueue для потокобезпечних операцій з пріоритетною чергою.
