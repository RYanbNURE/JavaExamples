package org.khnure.lect7collectionextended.ex5blocking.ex1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//Пояснення: Показує поведінку BlockingQueue при спробі додати елементи понад її місткість.
public class Main {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(2);
        blockingQueue.add("Element 1");
        blockingQueue.add("Element 2");

        try {
            blockingQueue.add("Element 3"); // This will throw an IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println("Cannot add element to full BlockingQueue");
        }
    }
}