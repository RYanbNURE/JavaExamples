package org.khnure.lect10threads.ex1threads;

public class Ex5ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyThreadGroup");
        for (int i = 0; i < 10; i++) {
            MyRunnable r = new MyRunnable();
            Thread t = new Thread(group, r);
            t.start();
        }
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running");
    }
}
