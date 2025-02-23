package org.khnure.lect9ionio.ex2nio.ex1channelsread;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

//Використовується Path для визначення шляху до файлу

//FileChannel відкривається в режимі читання

//ByteBuffer використовується як контейнер для даних

//Метод flip() готує буфер для читання після запису

//Метод clear() очищує буфер для наступного використання

public class ChannelReadExample {
    public static void main(String[] args) {
        try {
            // Створюємо шлях до файлу
            Path path = Path.of("src/main/resources/lect12/test.txt");
//            Path path = Path.of("test.txt");

            // Відкриваємо канал для читання
            FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);

            // Створюємо буфер розміром 1024 байти
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            System.out.println("Починаємо читання з файлу...");

            // Читаємо дані з каналу в буфер
            int bytesRead = channel.read(buffer);

            while (bytesRead != -1) {
                System.out.println("Прочитано " + bytesRead + " байт");

                // Підготовка буфера для читання
                buffer.flip();

                // Читаємо байти з буфера
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }

                // Очищуємо буфер
                buffer.clear();
                bytesRead = channel.read(buffer);
            }

            channel.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
