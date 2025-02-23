package org.khnure.lect06bcollectionextended.ex7customthreadsafe;

import java.util.concurrent.locks.StampedLock;

public class Main7 {
    private static StampedLock lock = new StampedLock();
    private static int sharedData = 0;

    public static void main(String[] args) {
        long stamp = lock.writeLock();
        try {
            sharedData++;
            System.out.println("Data updated to: " + sharedData);
        } finally {
            lock.unlockWrite(stamp);
        }

        stamp = lock.tryOptimisticRead();
        if (!lock.validate(stamp)) {
            stamp = lock.readLock();
            try {
                System.out.println("Reading data: " + sharedData);
            } finally {
                lock.unlockRead(stamp);
            }
        } else {
            System.out.println("Optimistic read succeeded: " + sharedData);
        }
    }
}
// Використання StampedLock для оптимістичного блокування.