package org.khnure.lect6bcollectionextended.ex5singleelemcollections.ex1singlelist;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> singleItemList = Collections.singletonList("OnlyOne");
        System.out.println("Single element list contains: " + singleItemList);
//        singleItemList.add("Test");
//        System.out.println(singleItemList);
    }
}
// Створення списку з одного елементу. Незмінні, будь-яка спроба змінити приведе до виключення.