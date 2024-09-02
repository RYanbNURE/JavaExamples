package org.khnure.lect5otherentities.ex2interfacesextends;

// Клас Car реалізує інтерфейс Movable
public class Car implements Movable {
    @Override
    public void move() {
        System.out.println("Car is moving."); // Транспорт переміщується
    }
}
