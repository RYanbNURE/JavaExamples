package org.khnure.lect13web.ex1net;

import java.net.*;

public class NetworkExample {
    public static void main(String[] args) throws Exception {
        // URL обработка
        URL url = new URL("https://www.example.com");
        URLConnection connection = url.openConnection();
        System.out.println("Content type: " + connection.getContentType());

        // Работа с URI
        URI uri = new URI("https://example.com/path?param=value");
        System.out.println("Path: " + uri.getPath());
        System.out.println("Query: " + uri.getQuery());
    }
}