package org.khnure.lect9ionio.ex2nio.ex6pathoperator;

import java.nio.file.Path;
import java.nio.file.Paths;

//Створення шляхів різними способами

//Отримання компонентів шляху

//Нормалізація шляху (видалення надлишкових елементів)

//Створення відносних шляхів

public class PathOperationsExample {
    public static void main(String[] args) {
        // Створюємо різні шляхи
        Path path1 = Paths.get("/home/user/docs/file.txt");
        Path path2 = Paths.get("docs", "file.txt");

        System.out.println("Повний шлях: " + path1);
        System.out.println("Кількість елементів: " + path1.getNameCount());
        System.out.println("Корінь шляху: " + path1.getRoot());
        System.out.println("Батьківський шлях: " + path1.getParent());
        System.out.println("Ім'я файлу: " + path1.getFileName());

        // Нормалізація шляху
        Path path3 = Paths.get("/home/./user/../user/docs");
        System.out.println("\nДо нормалізації: " + path3);
        System.out.println("Після нормалізації: " + path3.normalize());

        // Відносний шлях
        Path base = Paths.get("/home/user");
        Path full = Paths.get("/home/user/docs/file.txt");
        Path relative = base.relativize(full);
        System.out.println("\nВідносний шлях: " + relative);
    }
}
