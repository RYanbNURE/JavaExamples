package org.khnure.lect7collectionextended.ex6delay;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

//Пояснення: Демонструє використання DelayQueue для затримання отримання елементів.
class DelayedElement implements Delayed {
    private String element;
    private long delayTime;

    public DelayedElement(String element, long delayTime) {
        this.element = element;
        this.delayTime = System.currentTimeMillis() + delayTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = delayTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.delayTime < ((DelayedElement) o).delayTime) {
            return -1;
        }
        if (this.delayTime > ((DelayedElement) o).delayTime) {
            return 1;
        }
        return 0;
    }

    public String getElement() {
        return element;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> delayQueue = new DelayQueue<>();
        delayQueue.put(new DelayedElement("Element 1", 5000));
        delayQueue.put(new DelayedElement("Element 2", 3000));

        System.out.println("Polling element: " + delayQueue.take().getElement());
    }
}