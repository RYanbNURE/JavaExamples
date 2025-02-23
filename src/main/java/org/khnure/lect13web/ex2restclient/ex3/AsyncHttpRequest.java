package org.khnure.lect13web.ex2restclient.ex3;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

/**
 * Демонстрація асинхронних HTTP запитів
 */
public class AsyncHttpRequest {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/users/github"))
                .build();

        System.out.println("Відправка асинхронного запиту...");



        // Очікування завершення запиту

    }
}
