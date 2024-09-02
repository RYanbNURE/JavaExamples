package org.khnure.lect3oop.ex1inheritance;

// Клас Planet наслідується від SpaceObject
public class Planet extends SpaceObject {
    private int positionX; // Позиція по осі X
    private int positionY; // Позиція по осі Y

    public Planet(String name, int x, int y) {
        super(name);
        this.positionX = x;
        this.positionY = y;
    }

    @Override
    public void display() {
        System.out.println("Відображення планети " + name + " на позиції (" + positionX + ", " +
                positionY + ")");
    }
}
