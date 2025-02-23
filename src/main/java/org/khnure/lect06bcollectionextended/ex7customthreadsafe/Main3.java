package org.khnure.lect06bcollectionextended.ex7customthreadsafe;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedTask implements Delayed {
    private final long delayTime;
    private final long creationTime;

    DelayedTask(long delayInMilliseconds) {
        this.delayTime = delayInMilliseconds;
        this.creationTime = System.currentTimeMillis();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = delayTime - (System.currentTimeMillis() - creationTime);
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.getDelay(TimeUnit.MILLISECONDS) < o.getDelay(TimeUnit.MILLISECONDS)) {
            return -1;
        } else if (this.getDelay(TimeUnit.MILLISECONDS) > o.getDelay(TimeUnit.MILLISECONDS)) {
            return 1;
        }
        return 0;
    }
}

public class Main3 {
    public static void main(String[] args) {
        DelayQueue<DelayedTask> queue = new DelayQueue<>();
        queue.add(new DelayedTask(1000));
        System.out.println("Task scheduled in DelayQueue.");
    }
}
// Використання DelayQueue для потокобезпечного планування завдань, які залежать від часу.
