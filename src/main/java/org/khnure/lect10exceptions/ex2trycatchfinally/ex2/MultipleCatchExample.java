package org.khnure.lect10exceptions.ex2trycatchfinally.ex2;

import java.io.*;

/**
 * Демонстрація множинних блоків catch
 */
public class MultipleCatchExample {
    public static void main(String[] args) {
        System.out.println("Спроба читання файлу...");

        try {
            FileReader file = new FileReader("nonexistent.txt");
            int x = Integer.parseInt("abc"); // NumberFormatException
            file.read(); // не виконається
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Помилка перетворення числа: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Помилка вводу-виводу: " + e.getMessage());
        } finally {
            System.out.println("Очищення ресурсів");
        }
    }
}