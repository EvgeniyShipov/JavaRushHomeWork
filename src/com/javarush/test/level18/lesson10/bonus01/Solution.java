package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String filename = args[1];
        String fileOutputName = args[2];
        FileInputStream inputStream = new FileInputStream(filename);
        FileOutputStream outputStream = new FileOutputStream(fileOutputName);

        if (args[0].equals("-e"))
        {
            encoding(inputStream, outputStream);
        } else if (args[0].equals("-d"))
        {
            decryption(inputStream, outputStream);
        }

        inputStream.close();
        outputStream.close();
    }

    public static void encoding(FileInputStream inputStream, FileOutputStream outputStream) throws IOException {
        int key = 5;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data + key);
        }
    }
    public static void decryption(FileInputStream inputStream, FileOutputStream outputStream) throws IOException {
        int key = 5;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data - key);
        }
    }


}

