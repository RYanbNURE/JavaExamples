package org.khnure.lect13web.ex3sockets;

// Server.java
import java.net.*;
import java.io.*;

/**
 * Демонстрація простого TCP сервера
 */
public class SimpleServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Сервер запущено на порту 5000");

            // Очікування підключення клієнта
            try (Socket clientSocket = serverSocket.accept()) {
                System.out.println("Клієнт підключився: " +
                        clientSocket.getInetAddress());

                // Створення потоків введення/виведення
                PrintWriter out = new PrintWriter(
                        clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));

                // Читання повідомлення від клієнта
                String message = in.readLine();
                System.out.println("Отримано від клієнта: " + message);

                // Відправка відповіді
                out.println("Сервер отримав: " + message);
            }
        } catch (IOException e) {
            System.err.println("Помилка сервера: " + e.getMessage());
        }
    }
}