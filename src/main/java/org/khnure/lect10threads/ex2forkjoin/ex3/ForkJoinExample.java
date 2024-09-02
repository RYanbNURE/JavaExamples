package org.khnure.lect10threads.ex2forkjoin.ex3;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinExample {
    public static void main(String[] args) {
        int[] array = new int[100];
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int sum = forkJoinPool.invoke(new SumTask(array, 0, array.length));
        System.out.println("Sum: " + sum);
    }

}
