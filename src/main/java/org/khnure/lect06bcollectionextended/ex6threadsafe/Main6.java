package org.khnure.lect06bcollectionextended.ex6threadsafe;

import java.util.concurrent.ConcurrentSkipListMap;

public class Main6 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, String> skipListMap = new ConcurrentSkipListMap<>();
        skipListMap.put("Key", "Value");
        System.out.println("ConcurrentSkipListMap: " + skipListMap);
    }
}
// Використання ConcurrentSkipListMap для потокобезпечного навігування і доступу.
