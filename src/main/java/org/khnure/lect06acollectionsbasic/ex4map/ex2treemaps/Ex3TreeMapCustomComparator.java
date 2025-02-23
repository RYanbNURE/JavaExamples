package org.khnure.lect06acollectionsbasic.ex4map.ex2treemaps;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Демонстрація використання власного компаратора в TreeMap
 */
public class Ex3TreeMapCustomComparator {
    public static void main(String[] args) {
        // Створення TreeMap з власним компаратором (зворотній порядок)
        TreeMap<String, Integer> reverseMap = new TreeMap<>(Comparator.reverseOrder());

        reverseMap.put("A", 1);
        reverseMap.put("C", 3);
        reverseMap.put("B", 2);

        System.out.println("Зворотній порядок: " + reverseMap);

        // Створення TreeMap з компаратором за довжиною рядка
        TreeMap<String, Integer> lengthMap = new TreeMap<>(
                (s1, s2) -> Integer.compare(s1.length(), s2.length())
        );

        lengthMap.put("One", 1);
        lengthMap.put("Three", 3);
        lengthMap.put("Two", 2);

        System.out.println("Сортування за довжиною: " + lengthMap);
    }
}
