package org.khnure.lect13web.ex3sockets;

// Client.java
import java.net.*;
import java.io.*;

/**
 * Демонстрація простого TCP клієнта
 */
public class SimpleClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("Підключено до сервера");

            // Створення потоків введення/виведення
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            // Відправка повідомлення
            out.println("Привіт, сервер!");
            System.out.println("Повідомлення відправлено");

            // Отримання відповіді
            String response = in.readLine();
            System.out.println("Відповідь сервера: " + response);

        } catch (IOException e) {
            System.err.println("Помилка клієнта: " + e.getMessage());
        }
    }
}