package org.khnure.lect10exceptions.ex3checkedunchecked;

/**
 * Демонстрація ланцюжка виключень
 */
public class ChainedExceptionExample {
    public static void method3() throws Exception {
        throw new Exception("Початкова помилка");
    }

    public static void method2() throws CustomException {
        try {
            method3();
        } catch (Exception e) {
            System.out.println("Перехоплено в method2, створюємо новий ланцюжок");
            throw new CustomException("Помилка в method2", e);
        }
    }

    public static void method1() {
        try {
            method2();
        } catch (CustomException e) {
            System.out.println("Фінальне перехоплення в method1");
            System.out.println("Повідомлення: " + e.getMessage());
            System.out.println("Причина: " + e.getCause().getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        method1();
    }

    static class CustomException extends Exception {
        public CustomException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}