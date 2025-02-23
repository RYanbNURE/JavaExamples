package org.khnure.lect6bcollectionextended.ex5singleelemcollections.ex2singleset;

import java.util.Collections;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> singleItemSet = Collections.singleton("OnlyOne");
        System.out.println("Single element set contains: " + singleItemSet);
    }
}
// Створення множини з одного елементу. Елемент не можна змінити або додати нові.