package org.khnure.lect13web.ex1net;

import java.net.*;

public class ProxyExample {
    public static void main(String[] args) {
        // Настройка прокси
        Proxy proxy = new Proxy(Proxy.Type.HTTP,
                new InetSocketAddress("proxy.example.com", 8080));

        try {
            URL url = new URL("http://example.com");
            URLConnection conn = url.openConnection(proxy);
            // Использование соединения
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}