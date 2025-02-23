package org.khnure.lect9ionio.ex2nio.ex2channelswrite;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

//Створюється новий файл з опцією StandardOpenOption.CREATE

//Текст конвертується в байти і загортається в ByteBuffer

//Дані записуються в файл через канал

//Канал закривається після використання

public class ChannelWriteExample {
    public static void main(String[] args) {
        try {
            // Створюємо шлях до файлу
            Path path = Path.of("src/main/resources/lect12/output.txt");

            // Відкриваємо канал для запису (створюємо новий файл)
            FileChannel channel = FileChannel.open(path,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE);

            String text = "Це тестовий текст для запису через NIO Channel";
            ByteBuffer buffer = ByteBuffer.wrap(text.getBytes());

            System.out.println("Починаємо запис у файл...");

            // Записуємо дані з буфера в канал
            int bytesWritten = channel.write(buffer);

            System.out.println("Записано " + bytesWritten + " байт");

            channel.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
