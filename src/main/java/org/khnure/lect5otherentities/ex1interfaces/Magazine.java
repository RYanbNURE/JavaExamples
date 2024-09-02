package org.khnure.lect5otherentities.ex1interfaces;

// Клас Magazine реалізує інтерфейс Printable
public class Magazine implements Printable {

    private String name;
    private int issueNumber;

    // Конструктор класу Magazine
    public Magazine(String name, int issueNumber) {
        this.name = name;
        this.issueNumber = issueNumber;
    }

    // Реалізація методу print() з інтерфейсу Printable
    @Override
    public void print() {
        System.out.println("Magazine: " + name + ", Issue Number: " + issueNumber);
    }

}
