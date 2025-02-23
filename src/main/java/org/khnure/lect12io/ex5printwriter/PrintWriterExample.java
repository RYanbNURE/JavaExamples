package org.khnure.lect12io.ex5printwriter;

import java.io.*;

//Форматований вивід даних у файл

//Використання printf для форматування

//Створення табличного виводу

//Вирівнювання тексту

public class PrintWriterExample {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("formatted.txt"));

            // Форматований запис даних
            System.out.println("Записуємо форматовані дані...");

            writer.printf("Ім'я: %s, Вік: %d%n", "Іван", 25);
            System.out.println("Записано дані про особу");

            writer.printf("Ціна: %.2f грн%n", 199.99);
            System.out.println("Записано ціну");

            // Таблична форма
            writer.println("\nТаблиця даних:");
            writer.printf("%-10s %-8s %-6s%n", "Продукт", "Ціна", "К-сть");
            writer.printf("%-10s %-8.2f %-6d%n", "Хліб", 22.50, 3);
            writer.printf("%-10s %-8.2f %-6d%n", "Молоко", 45.75, 2);

            writer.close();

            // Читаємо та виводимо результат
            System.out.println("\nЧитаємо записаний файл:");
            BufferedReader reader = new BufferedReader(new FileReader("formatted.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}