package org.khnure.lect5otherentities.ex1interfaces;

// Клас Book реалізує інтерфейс Printable
public class Book implements Printable {

    private String title;
    private String author;

    // Конструктор класу Book
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Реалізація методу print() з інтерфейсу Printable
    @Override
    public void print() {
        System.out.println("Book: " + title + " by " + author);
    }
}
