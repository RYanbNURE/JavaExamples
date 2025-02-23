package org.khnure.lect13web.ex2restclient.ex4;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Демонстрація HTTP запиту з користувацькими заголовками
 */
public class CustomHeadersRequest {
    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            // Створення мапи заголовків
            Map<String, String> headers = Map.of(
                    "User-Agent", "Java 11 HttpClient Bot",
                    "Accept", "application/json",
                    "Custom-Header", "Custom-Value"
            );

            // Створення запиту з заголовками
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://httpbin.org/headers"))
                    .headers(headers.entrySet().stream()
                            .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                            .toArray(String[]::new))
                    .GET()
                    .build();

            System.out.println("Відправка запиту з заголовками:");
            headers.forEach((key, value) ->
                    System.out.println(key + ": " + value));

            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            System.out.println("\nСтатус код: " + response.statusCode());
            System.out.println("Відповідь: " + response.body());

        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}
