package org.khnure.lect6bcollectionextended.ex7customthreadsafe;

import java.util.concurrent.ConcurrentLinkedQueue;

class ObjectPool {
    private final ConcurrentLinkedQueue<Object> pool;

    public ObjectPool(int size) {
        pool = new ConcurrentLinkedQueue<>();
        for (int i = 0; i < size; i++) {
            pool.offer(new Object());
        }
    }

    public Object borrow() {
        return pool.poll();
    }

    public void release(Object obj) {
        pool.offer(obj);
    }
}

public class Main5 {
    public static void main(String[] args) {
        ObjectPool pool = new ObjectPool(10);
        Object obj = pool.borrow();
        System.out.println("Borrowed object from pool");
        pool.release(obj);
        System.out.println("Released object back to pool");
    }
}
// Створення потокобезпечного пулу об'єктів з використанням ConcurrentLinkedQueue.