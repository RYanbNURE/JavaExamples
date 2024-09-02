package org.khnure.lect10threads.ex2forkjoin.ex2;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer>{

    private int[] numbers;
    private int start, end;

    public SumTask(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
