package org.khnure.lect6collections.ex9generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates using generics with streams in Java.
 */

public class Ex20GenericsWithStreams {
    public static <T> List<T> filterList(List<T> list, T value) {
        return list.stream()
                .filter(element -> element.equals(value))
                .collect(Collectors.toList()); // Фільтруємо список
    }

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("One", "Two", "Three", "Two");
        List<String> filteredList = filterList(strList, "Two");
        System.out.println(filteredList); // Друкуємо відфільтрований список
    }
}
