package org.khnure.lect3oop.ex1inheritance;

// Основний клас для демонстрації
public class Main {
    public static void main(String[] args) {
        // Створення об'єктів планет і Місяця
        Planet earth = new Planet("Земля", 10, 20);
        Moon moon = new Moon("Місяць", 30, 40);

        // Відображення об'єктів
        earth.display();
        moon.display();
    }
}
