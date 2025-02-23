package org.khnure.lect08fucjava.ex3switchex;

public class Main7 {
public static void main(String[] args) {
    type_code code = type_code.RED;
    Runnable action = switch (code) {
        case RED -> () -> System.out.println("Stop");
        case YELLOW -> () -> System.out.println("Caution");
        case GREEN -> () -> System.out.println("Go");
    };
    action.run();
}

enum type_code {
    RED, YELLOW, GREEN
}
}
// Просунуте використання switch з методами та лямбда для сигнальних кодів.