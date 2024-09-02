package org.khnure.lect02branchingloops.ex2loops;

public class Main10 {
    public static void main(String[] args) {
        int[][] grid = {{1, 2}, {3, 4}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.println("Element at grid[" + i + "][" + j + "] = " + grid[i][j]);
            }
        }
    }
}
// Demonstrates looping through a two-dimensional array using nested for loops.
// Демонструє проходження через двовимірний масив за допомогою вкладених for циклів.