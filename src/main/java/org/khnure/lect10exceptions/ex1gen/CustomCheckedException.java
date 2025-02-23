package org.khnure.lect10exceptions.ex1gen;

/**
 * Демонстрація створення власного перевіряємого виключення
 */
public class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
        System.out.println("Створено перевіряєме виключення: " + message);
    }

    public static void main(String[] args) {
        try {
            throw new CustomCheckedException("Тестове перевіряєме виключення");
        } catch (CustomCheckedException e) {
            System.out.println("Перехоплено виключення: " + e.getMessage());
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
    }
}