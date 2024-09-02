package org.khnure.lect10threads.ex1threads;

public class Ex2MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable running");
    }
    public static void main(String[] args) {
        Ex2MyRunnable r = new Ex2MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
