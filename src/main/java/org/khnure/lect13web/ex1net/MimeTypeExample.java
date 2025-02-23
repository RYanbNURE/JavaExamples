package org.khnure.lect13web.ex1net;

import java.net.FileNameMap;
import java.net.URLConnection;

public class MimeTypeExample {
    public static void main(String[] args) {
        FileNameMap fileNameMap = URLConnection.getFileNameMap();
        String mimeType = fileNameMap.getContentTypeFor("file.jpg");
        System.out.println("MIME type: " + mimeType);
    }
}