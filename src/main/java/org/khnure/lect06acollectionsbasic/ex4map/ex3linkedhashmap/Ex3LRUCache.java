package org.khnure.lect06acollectionsbasic.ex4map.ex3linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Реалізація LRU (Least Recently Used) кешу за допомогою LinkedHashMap
 */
public class Ex3LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public Ex3LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        Ex3LRUCache<Integer, String> cache = new Ex3LRUCache<>(3);

        System.out.println("Додавання елементів у кеш:");
        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");
        System.out.println("Кеш після додавання 3 елементів: " + cache);

        // Додавання четвертого елемента видалить найстаріший
        cache.put(4, "Four");
        System.out.println("Після додавання четвертого елемента: " + cache);

        // Доступ до елемента оновлює його позицію
        cache.get(2);
        System.out.println("Після доступу до елемента 2: " + cache);
    }
}
