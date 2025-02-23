package org.khnure.lect10exceptions.ex2trycatchfinally.ex1;

/**
 * Демонстрація базової структури try-catch-finally
 */
public class BasicTryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Початок програми");

        try {
            System.out.println("Входимо в блок try");
            int result = 10 / 0; // викликає ArithmeticException
            System.out.println("Цей код не виконається");
        } catch (ArithmeticException e) {
            System.out.println("Перехоплено помилку: " + e.getMessage());
        } finally {
            System.out.println("Блок finally виконується завжди");
        }

        System.out.println("Кінець програми");
    }
}
