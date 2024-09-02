package org.khnure.lect10threads.ex2forkjoin.ex4completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(s -> s + " World")
                .thenAccept(System.out::println)
                .join();
    }

}
