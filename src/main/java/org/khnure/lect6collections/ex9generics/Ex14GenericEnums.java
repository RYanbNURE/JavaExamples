package org.khnure.lect6collections.ex9generics;

public enum Ex14GenericEnums {
    RED, GREEN, BLUE;

    public static <T extends Enum<T>> void printValues(Class<T> enumType) {
        for (T value : enumType.getEnumConstants()) {
            System.out.print(value + " "); // Друкуємо значення enum
        }
    }

    public static void main(String[] args) {
        printValues(Ex14GenericEnums.class);
    }
}
