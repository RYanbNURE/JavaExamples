package org.khnure.lect4classes.ex8assisiation;

import java.util.ArrayList;
import java.util.List;

// Клас, що представляє студента
public class Student {
    // Змінна для зберігання списку книг, які має студент
    private List<Book> books;

    // Конструктор класу Student, ініціалізує список книг
    public Student() {
        this.books = new ArrayList<>();
    }

    // Метод для додавання книги до списку книг студента
    public void addBook(Book book) {
        books.add(book);
    }

    // Метод для отримання списку книг студента
    public List<Book> getBooks() {
        return books;
    }
}
