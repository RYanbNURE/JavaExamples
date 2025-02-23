package org.khnure.lect6bcollectionextended.ex6threadsafe;

import java.util.concurrent.PriorityBlockingQueue;

public class Main8 {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> pbQueue = new PriorityBlockingQueue<>();
        pbQueue.add("Priority");
        System.out.println("PriorityBlockingQueue: " + pbQueue);
    }
}
// Використання PriorityBlockingQueue для потокобезпечних операцій з пріоритетною чергою.
