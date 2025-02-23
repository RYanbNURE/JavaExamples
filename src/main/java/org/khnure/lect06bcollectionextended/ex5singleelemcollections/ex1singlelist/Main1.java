package org.khnure.lect06bcollectionextended.ex5singleelemcollections.ex1singlelist;

import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<String> singleItemList = Collections.singletonList("Immutable");
        try {
            singleItemList.add("NewElement");
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: Cannot modify immutable collection. " + e);
        }
    }
}
// Демонстрація незмінності одноелементної колекції.
