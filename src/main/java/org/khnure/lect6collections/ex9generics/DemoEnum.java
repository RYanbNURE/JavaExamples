package org.khnure.lect6collections.ex9generics;

public class DemoEnum {
    public static void main(String[] args) {
        DaysOFWeeks monday1 = DaysOFWeeks.MONDAY;
        DaysOFWeeks monday2 = DaysOFWeeks.MONDAY;
        DaysOFWeeks monday3 = DaysOFWeeks.valueOf("MONDAY");

        System.out.println(monday1 == monday3);
    }
}
