package org.khnure.lect10exceptions.ex2trycatchfinally.ex4;

/**
 * Демонстрація вкладених блоків try-catch
 */
public class NestedTryCatch {
    public static void main(String[] args) {
        System.out.println("Початок зовнішнього try");

        try {
            System.out.println("Зовнішній try");

            try {
                System.out.println("Внутрішній try");
                throw new IllegalArgumentException("Внутрішня помилка");
            } catch (IllegalArgumentException e) {
                System.out.println("Внутрішній catch: " + e.getMessage());
                throw new RuntimeException("Перекидаємо помилку", e);
            } finally {
                System.out.println("Внутрішній finally");
            }

        } catch (RuntimeException e) {
            System.out.println("Зовнішній catch: " + e.getMessage());
            System.out.println("Причина: " + e.getCause().getMessage());
        } finally {
            System.out.println("Зовнішній finally");
        }

        System.out.println("Кінець програми");
    }
}