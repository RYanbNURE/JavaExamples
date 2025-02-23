package org.khnure.lect7collectionextended.ex5singleelemcollections.ex1singlelist;

import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> singleItemList = Collections.singletonList("IterateThis");
        for (String item : singleItemList) {
            System.out.println("Item from the collection: " + item);
        }
    }
}
// Ітерація по одноелементній колекції.