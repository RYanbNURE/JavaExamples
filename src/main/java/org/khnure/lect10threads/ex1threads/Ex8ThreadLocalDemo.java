package org.khnure.lect10threads.ex1threads;

public class Ex8ThreadLocalDemo {
    private static ThreadLocal<String> tl = new ThreadLocal<>();
    public static void main(String[] args) {
        tl.set("Canada");
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(tl.get());
                }
            });
            thread.start();
        }
    }
}
