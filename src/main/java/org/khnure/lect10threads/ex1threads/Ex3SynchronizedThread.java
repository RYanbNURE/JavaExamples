package org.khnure.lect10threads.ex1threads;

public class Ex3SynchronizedThread implements Runnable {
    private int counter = 0;
    public void run() {
        synchronized (this) {
            System.out.println("Counter: " + counter++);
        }
    }
    public static void main(String[] args) {
        Ex3SynchronizedThread t = new Ex3SynchronizedThread();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }

}
