package org.khnure.lect10exceptions.ex3checkedunchecked;

/**
 * Демонстрація виключення з додатковими полями
 */
public class BusinessException extends Exception {
    private final String errorCode;
    private final String operation;

    public BusinessException(String message, String errorCode, String operation) {
        super(message);
        this.errorCode = errorCode;
        this.operation = operation;
        System.out.printf("Створено бізнес-виключення: код=%s, операція=%s%n",
                errorCode, operation);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getOperation() {
        return operation;
    }

    public static void main(String[] args) {
        try {
            throw new BusinessException(
                    "Помилка обробки платежу",
                    "PAY_001",
                    "payment_processing"
            );
        } catch (BusinessException e) {
            System.out.println("Повідомлення: " + e.getMessage());
            System.out.println("Код помилки: " + e.getErrorCode());
            System.out.println("Операція: " + e.getOperation());
        }
    }
}