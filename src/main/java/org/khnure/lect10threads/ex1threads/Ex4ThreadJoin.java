package org.khnure.lect10threads.ex1threads;

public class Ex4ThreadJoin implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread finished");
    }
    public static void main(String[] args) {
        Ex4ThreadJoin t = new Ex4ThreadJoin();
        Thread t1 = new Thread(t);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main finished");
    }
}
