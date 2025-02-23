package org.khnure.lect10reflection.ex11;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try {
            final class FinalClass {
                public final int constant = 100;
            }

            FinalClass obj = new FinalClass();
            Field field = FinalClass.class.getDeclaredField("constant");

            // Make the final field accessible
            field.setAccessible(true);

            // Modify value of the final field
            field.setInt(obj, 200);
            System.out.println("Modified Value: " + field.getInt(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Українська: Цей приклад демонструє, як змінити значення фінального поля за допомогою методу setAccessible(true).
