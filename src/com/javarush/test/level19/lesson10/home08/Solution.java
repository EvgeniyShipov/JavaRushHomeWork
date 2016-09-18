package com.javarush.test.level19.lesson10.home08;

/* Перевертыши
1 Считать с консоли имя файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке
2.2 вывести на экран
3 Закрыть потоки. Не использовать try-with-resources

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(fileName));
        while (reader1.ready()) {
            char[] chars = reader1.readLine().toCharArray();
            char[] chars1 = new char[chars.length];
            for (int i = chars.length; i > 0; i--) {
                chars1[chars1.length - i] = chars[i - 1];
            }
            System.out.println(String.copyValueOf(chars1));
        }
        reader1.close();
    }
}
