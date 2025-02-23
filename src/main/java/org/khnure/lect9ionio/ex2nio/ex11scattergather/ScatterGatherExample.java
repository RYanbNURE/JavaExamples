package org.khnure.lect9ionio.ex2nio.ex11scattergather;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

//Розділення даних на кілька буферів при читанні

//Читання даних з одного каналу в кілька буферів

//Окрема обробка заголовка та тіла даних

public class ScatterGatherExample {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("test.txt");
            FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);

            // Створюємо кілька буферів
            ByteBuffer header = ByteBuffer.allocate(8);
            ByteBuffer body = ByteBuffer.allocate(100);

            // Scatter-read у кілька буферів
            ByteBuffer[] buffers = { header, body };
            channel.read(buffers);

            // Виводимо вміст header
            header.flip();
            System.out.println("Header:");
            while(header.hasRemaining()) {
                System.out.print((char) header.get());
            }

            // Виводимо вміст body
            body.flip();
            System.out.println("\nBody:");
            while(body.hasRemaining()) {
                System.out.print((char) body.get());
            }

            channel.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
