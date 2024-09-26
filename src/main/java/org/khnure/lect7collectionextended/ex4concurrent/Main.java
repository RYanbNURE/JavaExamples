package org.khnure.lect7collectionextended.ex4concurrent;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

//Пояснення: Демонструє використання ConcurrentLinkedQueue для потокобезпечних операцій черги.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("Element 1");
        queue.add("Element 2");

        System.out.println("ConcurrentLinkedQueue: " + queue);
    }
}
