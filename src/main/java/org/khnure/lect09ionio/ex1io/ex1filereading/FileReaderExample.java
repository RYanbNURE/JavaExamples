package org.khnure.lect09ionio.ex1io.ex1filereading;

import java.io.FileReader;
import java.io.BufferedReader;

//Базове читання файлу за допомогою FileReader

//Використання BufferedReader для ефективного читання

//Построкове читання файлу

//Правильне закриття ресурсів

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            // Створюємо FileReader для читання файлу
            FileReader fileReader = new FileReader("test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("Починаємо читання файлу:");

            String line;
            int lineNumber = 1;

            // Читаємо файл построково
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Рядок " + lineNumber + ": " + line);
                lineNumber++;
            }

            bufferedReader.close();
            fileReader.close();

        } catch (Exception e) {
            System.out.println("Помилка при читанні файлу: " + e.getMessage());
        }
    }
}
