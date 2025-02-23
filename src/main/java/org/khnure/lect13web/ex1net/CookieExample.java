package org.khnure.lect13web.ex1net;

import java.net.*;

public class CookieExample {
    public static void main(String[] args) {
        CookieManager manager = new CookieManager();
        CookieHandler.setDefault(manager);

        // Работа с cookies
        CookieStore cookieStore = manager.getCookieStore();
        HttpCookie cookie = new HttpCookie("name", "value");
        // Добавление cookie
    }
}