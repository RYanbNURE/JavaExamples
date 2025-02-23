package org.khnure.lect5otherentities.ex8enums.ex1;

//Базове оголошення enum

//Отримання значень enum

//Використання методів name() та ordinal()

//Перебір всіх значень enum

public class BasicEnumExample {
    // Оголошення простого enum
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Використання enum
        DayOfWeek today = DayOfWeek.MONDAY;

        System.out.println("Поточний день: " + today);
        System.out.println("Назва enum константи: " + today.name());
        System.out.println("Порядковий номер: " + today.ordinal());

        // Перебір всіх значень enum
        System.out.println("\nВсі дні тижня:");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}
