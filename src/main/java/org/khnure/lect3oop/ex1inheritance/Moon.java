package org.khnure.lect3oop.ex1inheritance;

// Клас Moon наслідується від SpaceObject
public class Moon extends SpaceObject {
    private int positionX; // Позиція по осі X
    private int positionY; // Позиція по осі Y

    public Moon(String name, int x, int y) {
        super(name);
        this.positionX = x;
        this.positionY = y;
    }

    @Override
    public void display() {
        System.out.println("Відображення Місяця " + name + " на позиції (" + positionX + ", " +
                positionY + ")");
    }
}
