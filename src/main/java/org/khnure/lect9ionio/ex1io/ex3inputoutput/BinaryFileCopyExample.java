package org.khnure.lect9ionio.ex1io.ex3inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//Роботу з бінарними файлами

//Використання буфера для ефективного копіювання

//Підрахунок скопійованих байтів

//Коректне закриття потоків введення/виведення

public class BinaryFileCopyExample {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("source.jpg");
            FileOutputStream output = new FileOutputStream("destination.jpg");

            byte[] buffer = new byte[1024];
            int bytesRead;
            long totalBytes = 0;

            System.out.println("Починаємо копіювання файлу...");

            // Копіюємо файл блоками
            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
                System.out.println("Скопійовано " + totalBytes + " байт");
            }

            input.close();
            output.close();

            System.out.println("Копіювання завершено. Всього скопійовано: " +
                    totalBytes + " байт");

        } catch (Exception e) {
            System.out.println("Помилка при копіюванні: " + e.getMessage());
        }
    }
}
