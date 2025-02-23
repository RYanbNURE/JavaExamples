package org.khnure.lect13web.ex2restclient.ex2;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Демонстрація POST запиту з JSON даними
 */
public class JsonPostRequest {
    public static void main(String[] args) {
        try {
            String jsonBody = """
                {
                    "title": "foo",
                    "body": "bar",
                    "userId": 1
                }""";

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://jsonplaceholder.typicode.com/posts"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                    .build();

            System.out.println("Відправка POST запиту з JSON...");
            System.out.println("Тіло запиту: " + jsonBody);

            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            System.out.println("Статус код: " + response.statusCode());
            System.out.println("Відповідь: " + response.body());

        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}