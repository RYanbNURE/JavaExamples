package org.khnure.lect10threads.ex1threads;

public class Ex7ThreadPriority implements Runnable {
    private final int N = 10;
    private int count = 0;
    @Override
    public void run() {
        while (count < N) {
            System.out.println("Thread running");
            count++;
            Thread.currentThread().setPriority(Math.max((int) (Math.random() * 100), 1));
        }
    }
    public static void main(String[] args) {
        new Thread(new Ex7ThreadPriority()).start();
    }
}
