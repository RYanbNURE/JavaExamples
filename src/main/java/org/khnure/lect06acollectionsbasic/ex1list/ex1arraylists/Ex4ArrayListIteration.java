package org.khnure.lect06acollectionsbasic.ex1list.ex1arraylists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Демонстрація різних способів ітерації по ArrayList
 */
public class Ex4ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(java.util.Arrays.asList("John", "Alice", "Bob", "Carol"));

        // For-each цикл
        System.out.println("Використання for-each:");
        for (String name : names) {
            System.out.println(name);
        }

        // Використання Iterator
        System.out.println("\nВикористання Iterator:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Використання ListIterator (можна рухатись в обох напрямках)
        System.out.println("\nВикористання ListIterator у зворотньому напрямку:");
        ListIterator<String> listIterator = names.listIterator(names.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Класичний for цикл
        System.out.println("\nВикористання класичного for:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
