package org.khnure.lect8fucjava.ex3switchex;

public class Main5 {

    public static void main(String[] args) {
        Object obj = "Hello";
        String result = switch (obj) {
            case String s -> "String of length: " + s.length();
            case Integer i -> "Integer: " + i;
            default -> "Unknown type";
        };
        System.out.println("Result: " + result);
    }
}
// Використання зразкового зіставлення в switch виразі для обробки різних типів даних.
