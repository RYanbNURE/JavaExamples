package org.khnure.lect6bcollectionextended.ex7customthreadsafe;

import java.util.concurrent.Semaphore;

public class Main4 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        try {
            semaphore.acquire();
            System.out.println("Resource under work");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaphore.release();
        }
    }
}
// Використання Semaphore для контролю доступу до ресурсу в багатопоточному середовищі.
