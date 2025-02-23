package org.khnure.lect9ionio.ex2nio.ex5directbuffer;

import java.nio.ByteBuffer;

//allocateDirect() створює буфер поза JVM купою

//Прямі буфери можуть давати кращу продуктивність при роботі з OS

//Прямі буфери використовують пам'ять поза купою Java

//Вони корисні для роботи з native I/O операціями

public class DirectBuffer {
    public static void main(String[] args) {
        // Створюємо прямий буфер
        ByteBuffer directBuffer = ByteBuffer.allocateDirect(1024);

        // Створюємо звичайний буфер
        ByteBuffer heapBuffer = ByteBuffer.allocate(1024);

        System.out.println("Прямий буфер:");
        System.out.println("isDirect: " + directBuffer.isDirect());
        System.out.println("Ємність: " + directBuffer.capacity());

        System.out.println("\nБуфер у купі:");
        System.out.println("isDirect: " + heapBuffer.isDirect());
        System.out.println("Ємність: " + heapBuffer.capacity());

        // Записуємо дані в прямий буфер
        directBuffer.putInt(42);
        directBuffer.flip();

        System.out.println("\nЗначення з прямого буфера: " + directBuffer.getInt());
    }
}
