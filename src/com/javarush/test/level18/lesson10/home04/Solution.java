package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream inputStream1 = new FileInputStream(file1);
        byte [] data = new byte[inputStream1.available()];
        while (inputStream1.available() > 0) {

            inputStream1.read(data);
        }
        inputStream1.close();

        FileInputStream inputStream2 = new FileInputStream(file2);
        FileOutputStream outputStream = new FileOutputStream(file1);

        while (inputStream2.available() > 0) {
            outputStream.write(inputStream2.read());
        }
        outputStream.write(data);
        inputStream2.close();
        outputStream.close();


    }
}
