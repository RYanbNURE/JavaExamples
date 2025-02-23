package org.khnure.lect13nio.ex3buffered;

import java.nio.ByteBuffer;

//allocate() створює новий буфер

//put() записує дані в буфер

//flip() готує буфер для читання

//get() читає дані з буфера

//clear() очищує буфер

public class BufferOperationsExample {
    public static void main(String[] args) {
        // Створюємо буфер на 8 байт
        ByteBuffer buffer = ByteBuffer.allocate(8);

        System.out.println("Початкова позиція: " + buffer.position());
        System.out.println("Початковий ліміт: " + buffer.limit());
        System.out.println("Початкова ємність: " + buffer.capacity());

        // Записуємо дані в буфер
        buffer.put((byte) 1);
        buffer.put((byte) 2);
        buffer.put((byte) 3);

        System.out.println("\nПісля запису трьох байтів:");
        System.out.println("Позиція: " + buffer.position());

        // Готуємо буфер для читання
        buffer.flip();

        System.out.println("\nПісля flip():");
        System.out.println("Позиція: " + buffer.position());
        System.out.println("Ліміт: " + buffer.limit());

        // Читаємо дані
        while(buffer.hasRemaining()) {
            System.out.println("Прочитано: " + buffer.get());
        }

        // Очищаємо буфер
        buffer.clear();

        System.out.println("\nПісля clear():");
        System.out.println("Позиція: " + buffer.position());
        System.out.println("Ліміт: " + buffer.limit());
    }
}