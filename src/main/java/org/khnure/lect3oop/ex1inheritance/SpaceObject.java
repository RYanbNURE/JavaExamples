package org.khnure.lect3oop.ex1inheritance;

// Базовий клас SpaceObject
public abstract class SpaceObject {
    protected String name; // Ім'я космічного об'єкта

    public SpaceObject(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Відображення " + name);
    }
}
