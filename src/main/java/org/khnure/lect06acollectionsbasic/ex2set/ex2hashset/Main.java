package org.khnure.lect06acollectionsbasic.ex2set.ex2hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Intersecting two sets
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        set1.retainAll(set2);
        System.out.println("Intersection of set1 and set2: " + set1);
    }
}
// Знаходження перетину двох множин з використанням retainAll().