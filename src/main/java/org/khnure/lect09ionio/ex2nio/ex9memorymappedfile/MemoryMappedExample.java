package org.khnure.lect09ionio.ex2nio.ex9memorymappedfile;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

//Мапування файлу в пам'ять

//Пряме читання та запис через буфер

//Автоматична синхронізація з файлом

//Ефективна робота з великими файлами

    public class MemoryMappedExample {
        public static void main(String[] args) {
            try {
                Path path = Paths.get("test.txt");

                // Відкриваємо канал для читання та запису
                FileChannel channel = FileChannel.open(path,
                        StandardOpenOption.READ, StandardOpenOption.WRITE);

                // Мапимо файл у пам'ять
                MappedByteBuffer buffer = channel.map(
                        FileChannel.MapMode.READ_WRITE, 0, channel.size());

                System.out.println("Файл мапований у пам'ять");

                // Читаємо дані
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }

                // Записуємо дані
                buffer.position(0);
                buffer.put("Нові дані".getBytes());

                // Зміни автоматично записуються у файл
                buffer.force();
                channel.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

