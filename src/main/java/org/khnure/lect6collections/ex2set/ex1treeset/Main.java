package org.khnure.lect6collections.ex2set.ex1treeset;

import org.khnure.lect6collections.ex1list.ex1arraylists.Student;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Creating a TreeSet with a custom comparator to sort integers in descending order
//        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        Set<Student> students = new TreeSet<>();
//        treeSet.add(10);
//        treeSet.add(20);
//        treeSet.add(5);

        students.add(new Student("Іван Петров", 20));
        students.add(new Student("Марія Сидорова", 21));
        students.add(new Student("Андрій Іванов", 19));
        System.out.println("TreeSet with custom comparator (descending order): " + students);
    }
}
// Ініціалізація TreeSet із власним компаратором для сортування цілих чисел в порядку спадання.