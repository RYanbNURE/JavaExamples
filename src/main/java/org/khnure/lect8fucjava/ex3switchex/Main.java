package org.khnure.lect8fucjava.ex3switchex;

public class Main {
    public static void main(String[] args) {
        String day = "MONDAY";
        String typeOfDay = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println("Today is a " + typeOfDay);
    }
}
// Використання сучасного switch виразу. Демонструється простий спосіб класифікації днів.
