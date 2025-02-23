package org.khnure.lect09ionio.ex1io.ex7pipedinput;

import java.io.*;

//Комунікацію між потоками через піпи

//Синхронізацію читання/запису

//Використання PipedInputStream/PipedOutputStream

//Багатопотокову обробку даних
public class PipedStreamExample {
    public static void main(String[] args) {
        try {
            final PipedOutputStream output = new PipedOutputStream();
            final PipedInputStream input = new PipedInputStream(output);

            // Потік-писач
            Thread writerThread = new Thread(() -> {
                try {
                    System.out.println("Писач: Починаю запис даних");
                    String message = "Привіт від писача!";
                    output.write(message.getBytes());
                    output.close();
                    System.out.println("Писач: Дані записано");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Потік-читач
            Thread readerThread = new Thread(() -> {
                try {
                    System.out.println("Читач: Починаю читання");
                    byte[] buffer = new byte[100];
                    int bytesRead = input.read(buffer);
                    String received = new String(buffer, 0, bytesRead);
                    System.out.println("Читач отримав: " + received);
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();

        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
