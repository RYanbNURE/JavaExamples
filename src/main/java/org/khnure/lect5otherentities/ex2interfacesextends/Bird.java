package org.khnure.lect5otherentities.ex2interfacesextends;

// Клас Bird реалізує інтерфейси Movable та Flyable
public class Bird implements Flyable {
    @Override
    public void move() {
        System.out.println("Bird is flying by moving its wings."); // Тварину переміщують, коли вона летить
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying."); // Тварину летить
    }

}
