package org.khnure.lect10exceptions.ex2trycatchfinally.ex3;

import java.io.*;

/**
 * Демонстрація try-with-resources для автоматичного закриття ресурсів
 */
public class TryWithResourcesExample {
    public static void main(String[] args) {
        System.out.println("Початок роботи з файлом");

        try (FileWriter writer = new FileWriter("test.txt");
             BufferedWriter buffWriter = new BufferedWriter(writer)) {

            System.out.println("Запис у файл...");
            buffWriter.write("Тестовий текст");

        } catch (IOException e) {
            System.out.println("Помилка роботи з файлом: " + e.getMessage());
        } // ресурси закриються автоматично

        System.out.println("Завершення роботи з файлом");
    }
}
