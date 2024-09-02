package org.khnure.lect10threads.ex1threads;

import java.util.concurrent.Semaphore;

public class Ex10SemaphoreDemo {
    private static Semaphore s = new Semaphore(1);
    public static void increment() {
        try {
            s.acquire();
            System.out.println("Incrementing...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Incremented");
            s.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void retrieve() {
        try {
            s.acquire();
            System.out.println("Retrieving...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Retrieved");
            s.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                increment();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                retrieve();
            }
        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
