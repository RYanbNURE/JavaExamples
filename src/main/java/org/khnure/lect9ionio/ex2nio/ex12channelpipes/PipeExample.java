package org.khnure.lect9ionio.ex2nio.ex12channelpipes;

import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

//Створення однонаправленого каналу між потоками

//Запис даних через SinkChannel

//Читання даних через SourceChannel

//Асинхронна передача даних між потоками

public class PipeExample {
    public static void main(String[] args) {
        try {
            // Створюємо pipe
            Pipe pipe = Pipe.open();

            // Створюємо та запускаємо потік для запису
            Thread writerThread = new Thread(() -> {
                try {
                    Pipe.SinkChannel sinkChannel = pipe.sink();
                    String message = "Привіт через pipe!";
                    ByteBuffer buffer = ByteBuffer.allocate(48);
                    buffer.put(message.getBytes());
                    buffer.flip();

                    while(buffer.hasRemaining()) {
                        sinkChannel.write(buffer);
                    }
                    sinkChannel.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            // Створюємо та запускаємо потік для читання
            Thread readerThread = new Thread(() -> {
                try {
                    Pipe.SourceChannel sourceChannel = pipe.source();
                    ByteBuffer buffer = ByteBuffer.allocate(48);

                    int bytesRead = sourceChannel.read(buffer);
                    buffer.flip();

                    System.out.println("Отримано: " +
                            new String(buffer.array(), 0, bytesRead));
                    sourceChannel.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
