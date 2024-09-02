package org.khnure.lect10threads.ex2forkjoin.ex2;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(4);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SumTask task = new SumTask(numbers, 0, 10);

        pool.submit(task); //Надання завдання ForkJoinPool

        int result = task.join();

        System.out.println("Result: " + result);
    }
}
/*
У другому прикладі, ми створюємо SumTask, який бере масив цілих чисел, початковий індекс та кінцевий індекс. Завдання надається ForkJoinPool, а результат отримується за допомогою join() методу.
Ми можемо використати ForkJoinPool для виконання інших операцій в паралелю, таких як сортування великого масиву, або виконання операції Maps-Reduce над великим набором даних.
 */