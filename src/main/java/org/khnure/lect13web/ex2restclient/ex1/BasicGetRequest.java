package org.khnure.lect13web.ex2restclient.ex1;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * Демонстрація базового GET запиту з використанням HttpClient
 */
public class BasicGetRequest {
    public static void main(String[] args) {
        try {
            // Створення HTTP клієнта
            HttpClient client = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofSeconds(10))
                    .build();

            // Створення GET запиту
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://api.github.com/users/octocat"))
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            System.out.println("Відправка GET запиту...");

            // Виконання запиту
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            // Виведення результатів
            System.out.println("Статус код: " + response.statusCode());
            System.out.println("Заголовки: " + response.headers());
            System.out.println("Тіло відповіді: " + response.body());

        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}