package org.khnure.lect06bcollectionextended.ex7customthreadsafe;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    private static String resource = "Initial";
    private static ReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        lock.writeLock().lock();
        try {
            resource = "Modified";
        } finally {
            lock.writeLock().unlock();
        }
        lock.readLock().lock();
        try {
            System.out.println("Resource after modification: " + resource);
        } finally {
            lock.readLock().unlock();
        }
    }
}
// Використання ReadWriteLock для синхронізації доступу до спільних ресурсів.
