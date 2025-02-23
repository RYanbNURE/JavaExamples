package org.khnure.lect6bcollectionextended.ex5singleelemcollections.ex1singlelist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> singleItemList = Arrays.asList("OnlyOne");
        singleItemList = Collections.unmodifiableList(singleItemList);
        System.out.println("Unmodifiable singleton list: " + singleItemList);
    }
}
// Створення незмінного одноелементного списку з масиву.
