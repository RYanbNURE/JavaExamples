package org.khnure.lect6bcollectionextended.ex7customthreadsafe;

import java.util.concurrent.atomic.AtomicInteger;

public class Main1 {
public static void main(String[] args) {
    AtomicInteger atomicInt = new AtomicInteger(0);
    atomicInt.incrementAndGet();
    System.out.println("AtomicInteger after increment: " + atomicInt);
}
}
// Використання AtomicInteger для потокобезпечного інкрементації.
