package org.khnure.lect9ionio.ex2nio.ex7fileattributes;

import java.nio.file.*;
import java.nio.file.attribute.*;

//Читання базових атрибутів файлу

//Отримання часу створення, модифікації

//Зміна атрибутів файлу

//Перевірка типу файлу

public class FileAttributesExample {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("test.txt");

            // Базові атрибути
            BasicFileAttributes basic = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("Час створення: " + basic.creationTime());
            System.out.println("Останній доступ: " + basic.lastAccessTime());
            System.out.println("Остання модифікація: " + basic.lastModifiedTime());
            System.out.println("Це директорія? " + basic.isDirectory());
            System.out.println("Це файл? " + basic.isRegularFile());
            System.out.println("Розмір: " + basic.size());

            // Встановлення атрибутів
            FileTime newTime = FileTime.fromMillis(System.currentTimeMillis());
            Files.setAttribute(path, "basic:lastModifiedTime", newTime);

            System.out.println("\nНовий час модифікації: " +
                    Files.getAttribute(path, "basic:lastModifiedTime"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}