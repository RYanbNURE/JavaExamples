package org.khnure.lect3oop.ex2encapsulation.ex4;

import org.khnure.lect3oop.ex2encapsulation.ex3.Computer;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Створення об'єкту Computer з процесором "Intel i7"
        Computer myComputer = new Computer("Intel i7");

        // Встановлення оперативної пам'яті для комп'ютера
       // myComputer.memory = "16GB"; // Пакетний приватний член можна змінювати безпосередньо

        // Виведення процесора на консоль
        System.out.println("Процесор: " + myComputer.getProcessor());

        // Виведення оперативної пам'яті на консоль
        //System.out.println("Оперативна пам'ять: " + myComputer.memory);
    }
}
