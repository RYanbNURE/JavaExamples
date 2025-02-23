package org.khnure.lect9ionio.ex2nio.ex10watchservice;

import java.nio.file.*;
import static java.nio.file.StandardWatchEventKinds.*;

//Створення WatchService для спостереження за файловою системою

//Реєстрація подій створення, видалення та модифікації

//Обробка подій в реальному часі

//Постійне спостереження за змінами

public class WatchServiceExample {
    public static void main(String[] args) {
        try {
            WatchService watchService = FileSystems.getDefault().newWatchService();
            Path path = Paths.get(".");

            // Реєструємо події для спостереження
            path.register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

            System.out.println("Спостереження за директорією розпочато...");

            while (true) {
                WatchKey key = watchService.take();

                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                    Path fileName = (Path) event.context();

                    System.out.println("Подія: " + kind.name());
                    System.out.println("Файл: " + fileName);
                }

                // Скидаємо ключ для наступних подій
                boolean valid = key.reset();
                if (!valid) {
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
