package org.khnure.lect13nio.ex8asychronouschannel;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.*;
import java.util.concurrent.Future;

//Використання AsynchronousFileChannel

//Асинхронне читання з Future

//Очікування завершення операції

//Обробка прочитаних даних

public class AsyncChannelExample {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("test.txt");
            AsynchronousFileChannel channel =
                    AsynchronousFileChannel.open(path, StandardOpenOption.READ);

            ByteBuffer buffer = ByteBuffer.allocate(100);
            Future<Integer> operation = channel.read(buffer, 0);

            System.out.println("Читання розпочато асинхронно...");

            // Очікуємо завершення операції
            while (!operation.isDone()) {
                System.out.println("Очікування...");
                Thread.sleep(100);
            }

            buffer.flip();
            byte[] data = new byte[buffer.limit()];
            buffer.get(data);
            System.out.println("Прочитані дані: " + new String(data));

            channel.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}