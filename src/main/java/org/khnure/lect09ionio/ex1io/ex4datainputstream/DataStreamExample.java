package org.khnure.lect09ionio.ex1io.ex4datainputstream;

import java.io.*;

//Запис та читання примітивних типів даних

//Використання DataInputStream/DataOutputStream

//Збереження типів даних при записі/читанні

//Порядок читання має відповідати порядку запису

public class DataStreamExample {
    public static void main(String[] args) {
        try {
            // Запис примітивних типів у файл
            FileOutputStream fos = new FileOutputStream("data.bin");
            DataOutputStream dos = new DataOutputStream(fos);

            System.out.println("Записуємо дані...");

            // Записуємо різні типи даних
            dos.writeInt(100);
            System.out.println("Записано int: 100");

            dos.writeFloat(123.45f);
            System.out.println("Записано float: 123.45f");

            dos.writeBoolean(true);
            System.out.println("Записано boolean: true");

            dos.writeUTF("Тестовий рядок");
            System.out.println("Записано String: Тестовий рядок");

            dos.close();

            // Читаємо дані з файлу
            FileInputStream fis = new FileInputStream("data.bin");
            DataInputStream dis = new DataInputStream(fis);

            System.out.println("\nЧитаємо дані:");
            System.out.println("Прочитано int: " + dis.readInt());
            System.out.println("Прочитано float: " + dis.readFloat());
            System.out.println("Прочитано boolean: " + dis.readBoolean());
            System.out.println("Прочитано String: " + dis.readUTF());

            dis.close();

        } catch (IOException e) {
            System.out.println("Помилка вводу/виводу: " + e.getMessage());
        }
    }
}
