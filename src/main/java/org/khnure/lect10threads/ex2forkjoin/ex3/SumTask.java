package org.khnure.lect10threads.ex2forkjoin.ex3;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer> {
    private final int[] array;
    private final int start, end;

    SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 10) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        } else {
            int mid = (start + end) / 2;
            SumTask leftTask = new SumTask(array, start, mid);
            SumTask rightTask = new SumTask(array, mid, end);
            invokeAll(leftTask, rightTask);
            return leftTask.join() + rightTask.join();
        }
    }

}
