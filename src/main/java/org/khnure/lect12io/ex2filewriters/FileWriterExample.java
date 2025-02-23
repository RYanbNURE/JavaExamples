package org.khnure.lect12io.ex2filewriters;

import java.io.FileWriter;
import java.io.BufferedWriter;

//Запис у файл за допомогою FileWriter

//Використання BufferedWriter для оптимізації запису

//Додавання переносів рядків

//Примусовий запис буфера через flush()
public class FileWriterExample {
    public static void main(String[] args) {
        try {
            // Створюємо FileWriter для запису у файл
            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String[] lines = {
                    "Перший рядок",
                    "Другий рядок",
                    "Третій рядок"
            };

            System.out.println("Починаємо запис у файл...");

            // Записуємо кожен рядок
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Додаємо перенос рядка
                System.out.println("Записано: " + line);
            }

            bufferedWriter.flush(); // Примусово записуємо буфер
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Запис завершено успішно!");

        } catch (Exception e) {
            System.out.println("Помилка при записі у файл: " + e.getMessage());
        }
    }
}
