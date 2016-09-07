package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.next();
        String fileName2 = scanner.next();
        scanner.close();

        FileReader fileReader = new FileReader(fileName1);
        FileWriter fileWriter = new FileWriter(fileName2);

        String line = "";

        while (fileReader.ready()) {
            char data = (char) fileReader.read();
            line +=data;
        }
        String[] words = line.split(" ");
        for (String word : words) {
            if (word.matches("\\d+")) {
                fileWriter.write(word + " ");
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
