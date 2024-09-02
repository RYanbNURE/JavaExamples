package org.khnure.lect6collections.ex9generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex10GenericIterators {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // Друкуємо елемент списку ітератором
        }
    }
}
