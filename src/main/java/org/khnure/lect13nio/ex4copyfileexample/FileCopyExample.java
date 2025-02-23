package org.khnure.lect13nio.ex4copyfileexample;

import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

//Використовуються два канали: для читання та запису

//transferTo() копіює дані з одного каналу в інший

//Метод більш ефективний ніж традиційне копіювання через потоки

public class FileCopyExample {
    public static void main(String[] args) {
        try {
            Path sourcePath = Path.of("source.txt");
            Path targetPath = Path.of("target.txt");

            // Відкриваємо канали для читання та запису
            FileChannel sourceChannel = FileChannel.open(sourcePath, StandardOpenOption.READ);
            FileChannel targetChannel = FileChannel.open(targetPath,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE);

            System.out.println("Початок копіювання файлу...");

            // Копіюємо вміст від початку до кінця
            long bytesTransferred = sourceChannel.transferTo(0, sourceChannel.size(), targetChannel);

            System.out.println("Скопійовано " + bytesTransferred + " байт");

            sourceChannel.close();
            targetChannel.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}