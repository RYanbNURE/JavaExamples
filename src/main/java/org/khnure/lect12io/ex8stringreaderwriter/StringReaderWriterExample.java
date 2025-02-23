package org.khnure.lect12io.ex8stringreaderwriter;

import java.io.*;

//Роботу з рядками як з потоками

//Використання StringReader/StringWriter

//Різні способи читання даних

//Буферизоване читання символів

public class StringReaderWriterExample {
    public static void main(String[] args) {
        try {
            // Використання StringWriter
            StringWriter writer = new StringWriter();
            writer.write("Перший рядок\n");
            writer.write("Другий рядок\n");
            writer.write("Третій рядок");

            String result = writer.toString();
            System.out.println("Записано у StringWriter:");
            System.out.println(result);

            // Використання StringReader
            StringReader reader = new StringReader(result);

            System.out.println("\nЧитаємо посимвольно:");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            // Читання в буфер
            reader = new StringReader(result);
            char[] buffer = new char[10];
            System.out.println("\n\nЧитаємо блоками по 10 символів:");
            int charsRead;
            while ((charsRead = reader.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, charsRead));
            }

            writer.close();
            reader.close();

        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}