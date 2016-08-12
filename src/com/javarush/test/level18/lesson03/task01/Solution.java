package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        long sum = 0;

        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (sum < data) {sum = data;}

        }
        System.out.println(sum);
        reader.close();
        inputStream.close();

    }
}
