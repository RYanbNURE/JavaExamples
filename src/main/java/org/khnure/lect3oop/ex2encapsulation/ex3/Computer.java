package org.khnure.lect3oop.ex2encapsulation.ex3;

public class Computer {
    // Приватна змінна для зберігання процесора
    private String processor;

    // Пакетна приватна змінна для зберігання оперативної пам'яті
    String memory;

    // Конструктор класу, ініціалізує процесор та оперативну пам'ять
    public Computer(String processor) {
        this.processor = processor;
    }

    // Метод для отримання процесора
    public String getProcessor() {
        return processor;
    }

    // Метод для встановлення процесора
    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
