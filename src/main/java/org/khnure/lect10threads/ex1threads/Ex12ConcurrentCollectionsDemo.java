package org.khnure.lect10threads.ex1threads;

import java.util.concurrent.ConcurrentHashMap;

public class Ex12ConcurrentCollectionsDemo {
    private static ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
    public static void increment() {
        map.put("counter", Integer.toString(Integer.parseInt(map.get("counter"))));
        System.out.println("Counter incremented");
    }
    public static void retrieve() {
        System.out.println("Counter: " + map.get("counter"));
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
