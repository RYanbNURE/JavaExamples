package org.khnure.lect10threads.ex1threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ex14ScheduledExecutorServiceDemo {
    private static ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);
    public static void increment() {
        System.out.println("Incrementing...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Incremented");
    }
    public static void retrieve() {
        System.out.println("Retrieving...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Retrieved");
    }
    public static void main(String[] args) {
        executor.schedule(new Runnable() {
            @Override
            public void run() {
                increment();
            }
        }, 10, TimeUnit.SECONDS);
        executor.schedule(new Runnable() {
            @Override
            public void run() {
                retrieve();
            }
        }, 15, TimeUnit.SECONDS);
    }
}
