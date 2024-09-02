package org.khnure.lect10threads.ex1threads;

import java.util.concurrent.locks.ReentrantLock;

public class Ex13ReentrantLockDemo {
    private static ReentrantLock lock = new ReentrantLock();
    public static void increment() {
        lock.lock();
        System.out.println("Counter incremented");
        lock.unlock();
    }
    public static void retrieve() {
        System.out.println("Counter: " + lock.getHoldCount());
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
