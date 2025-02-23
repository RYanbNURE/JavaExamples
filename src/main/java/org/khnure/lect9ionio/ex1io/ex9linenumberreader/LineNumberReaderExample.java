package org.khnure.lect9ionio.ex1io.ex9linenumberreader;

import java.io.*;

//Використання LineNumberReader для нумерації рядків

//Встановлення власної нумерації

//Отримання номеру поточного рядка

//Читання файлу по рядках

public class LineNumberReaderExample {
    public static void main(String[] args) {
        try {
            // Створюємо тестовий файл
            FileWriter writer = new FileWriter("numbered.txt");
            writer.write("Перший рядок\nДругий рядок\nТретій рядок\n");
            writer.close();

            // Читаємо файл з нумерацією рядків
            LineNumberReader reader = new LineNumberReader(
                    new FileReader("numbered.txt"));

            System.out.println("Читаємо файл з нумерацією рядків:");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.printf("Рядок %d: %s%n",
                        reader.getLineNumber(), line);
            }

            // Встановлюємо власну початкову нумерацію
            reader = new LineNumberReader(new FileReader("numbered.txt"));
            reader.setLineNumber(100);

            System.out.println("\nЧитаємо з власною нумерацією (початок з 100):");
            while ((line = reader.readLine()) != null) {
                System.out.printf("Рядок %d: %s%n",
                        reader.getLineNumber(), line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
