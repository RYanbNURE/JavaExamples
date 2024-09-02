package org.khnure.lect10threads.ex1threads;

import java.util.concurrent.CountDownLatch;

public class Ex11LatchDemo {
    private static CountDownLatch latch = new CountDownLatch(1);
    public static void increment() {
        latch.countDown();
        System.out.println("Incremented");
    }
    public static void retrieve() {
        System.out.println("Retrieving...");
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Retrieved");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                increment();
            }
        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                retrieve();
            }
        });
        t2.start();
    }
}
