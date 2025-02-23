package org.khnure.lect6acollectionsbasic.ex1list.ex1arraylists;

import java.util.ArrayList;

/**
 * Демонстрація операцій пошуку та доступу до елементів ArrayList
 */
public class Ex3ArrayListSearchAccess {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(java.util.Arrays.asList("Red", "Green", "Blue", "Green", "Yellow"));

        // Пошук елемента
        System.out.println("Список кольорів: " + colors);
        System.out.println("Перший індекс 'Green': " + colors.indexOf("Green"));
        System.out.println("Останній індекс 'Green': " + colors.lastIndexOf("Green"));

        // Перевірка наявності
        System.out.println("Чи містить 'Blue': " + colors.contains("Blue"));
        System.out.println("Чи містить 'Purple': " + colors.contains("Purple"));

        // Отримання елементів
        System.out.println("Елемент за індексом 2: " + colors.get(2));

        // Заміна елемента
        String oldColor = colors.set(1, "Purple");
        System.out.println("Замінено '" + oldColor + "' на 'Purple': " + colors);
    }
}