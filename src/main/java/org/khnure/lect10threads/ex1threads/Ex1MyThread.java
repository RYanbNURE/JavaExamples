package org.khnure.lect10threads.ex1threads;

public class Ex1MyThread extends Thread {
    public Ex1MyThread(Runnable runnable) {
        super(runnable);
    }
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running");
            }
        });
        t.start();
    }
}
