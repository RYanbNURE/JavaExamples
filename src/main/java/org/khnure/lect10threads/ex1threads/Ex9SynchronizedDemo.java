package org.khnure.lect10threads.ex1threads;

public class Ex9SynchronizedDemo {
    private int count = 0;
    public synchronized void increment() {
        count++;
    }
    public void retrieve() {
        System.out.println("Count: " + count);
    }
    public static void main(String[] args) {
        Ex9SynchronizedDemo demo = new Ex9SynchronizedDemo();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.increment();
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
                demo.retrieve();
            }
        });
        t2.start();
    }
}
