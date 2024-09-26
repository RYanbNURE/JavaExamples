package org.khnure.lect7collectionextended.ex5blocking.ex2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(2);
        blockingQueue.put("Element 1");
        blockingQueue.put("Element 2");

        System.out.println("BlockingQueue element: " + blockingQueue.take());
        System.out.println("BlockingQueue element: " + blockingQueue.take());
    }
}