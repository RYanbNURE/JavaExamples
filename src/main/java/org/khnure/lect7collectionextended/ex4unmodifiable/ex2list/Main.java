package org.khnure.lect7collectionextended.ex4unmodifiable.ex2list;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Kotlin");

        List<String> unmodifiableList = Collections.unmodifiableList(list);
        list.add("Scala");

        System.out.println("Unmodifiable List after modifying underlying list: " + unmodifiableList);
        list.add("Ruby");
        System.out.println(unmodifiableList);


    }
}
// Зміни в початковому списку відобразяться в незмінному списку, оскільки вони посилаються на ті ж елементи.
