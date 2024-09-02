package org.khnure.lect4classes.ex8assisiation;

// Клас, що представляє книгу
public class Book {
    // Змінна для зберігання назви книги
    private String title;

    // Конструктор класу Book, ініціалізує назву книги
    public Book(String title) {
        this.title = title;
    }

    // Метод для отримання назви книги
    public String getTitle() {
        return title;
    }
}
