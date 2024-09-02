package org.khnure.lect6collections.ex2linkedlist;

// Створення рекорду для представлення студента
public record Student(String name, int age) {
    // Конструктор рекорду
    public Student {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age value");
        }
    }
}
