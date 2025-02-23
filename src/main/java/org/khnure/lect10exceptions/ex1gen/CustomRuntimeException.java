package org.khnure.lect10exceptions.ex1gen;

/**
 * Демонстрація створення власного неперевіряємого виключення
 */
public class CustomRuntimeException extends RuntimeException {
    public CustomRuntimeException(String message, Throwable cause) {
        super(message, cause);
        System.out.println("Створено неперевіряєме виключення: " + message);
    }

    public static void main(String[] args) {
        try {
            throw new CustomRuntimeException("Помилка виконання",
                    new IllegalArgumentException("Неправильний аргумент"));
        } catch (CustomRuntimeException e) {
            System.out.println("Перехоплено виключення: " + e.getMessage());
            System.out.println("Причина: " + e.getCause().getMessage());
        }
    }
}
