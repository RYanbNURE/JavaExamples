package org.khnure.lect6collections.ex9generics;

import java.util.ArrayList;
import java.util.List;

public class Ex1BasicGenerics {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello"); // Додаємо рядок до списку
        stringList.add("World");
//        stringList.add(1);

        // Access and print elements
        for (String str : stringList) {
            System.out.println(str); // Друкуємо елемент списку
        }
    }
}
