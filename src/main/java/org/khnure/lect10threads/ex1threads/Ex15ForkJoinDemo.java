package org.khnure.lect10threads.ex1threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class Ex15ForkJoinDemo {
    public static void main(String[] args) throws Exception {
        ForkJoinPool pool = new ForkJoinPool(10);
        ForkJoinTask<Integer> task = new RecursiveTask<Integer>() {
            @Override
            protected Integer compute() {
                return 1 + 2;
            }
        };
        ForkJoinTask<Integer> asyncResult = pool.submit(task);
        System.out.println("Result: " + asyncResult.get());
    }
}
