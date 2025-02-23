package org.khnure.lect13web.ex1net;

import java.net.URLEncoder;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class UrlEncodingExample {
    public static void main(String[] args) throws Exception {
        String encoded = URLEncoder.encode("Hello World!",
                StandardCharsets.UTF_8.toString());
        System.out.println("Encoded: " + encoded);

        String decoded = URLDecoder.decode(encoded,
                StandardCharsets.UTF_8.toString());
        System.out.println("Decoded: " + decoded);
    }
}