package org.khnure.lect8fucjava.ex3switchex;

public class Main3 {
    public static void main(String[] args) {
        int month = 12;
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Unknown";
        };
        System.out.println("Season is: " + season);
    }
}
// Використання множинних міток у кейсах switch виразу для визначення пори року.
