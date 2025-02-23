package org.khnure.lect6bcollectionextended.ex4unmodifiable.ex1list;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        List<String> stringList = Arrays.asList("q", "w");
//
//        stringList.add("e");
//        System.out.println(stringList);

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        List<String> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable List: " + unmodifiableList);

        unmodifiableList.add(0, "Test");
    }
}
// Створення незмінного списку. Якщо спробувати змінити його, виникне RuntimeException.