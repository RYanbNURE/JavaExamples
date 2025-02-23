package org.khnure.lect7collectionextended.ex6threadsafe;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main10 {
    public static void main(String[] args) {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(10);
        try {
            bq.put("Element");
            System.out.println("Element added to BlockingQueue");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
// Виконання операцій з BlockingQueue, які є потокобезпечними.
