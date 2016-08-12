package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        int data;
        int count = 0;

        FileInputStream inputStream = new FileInputStream(args[0]);
        while (inputStream.available() > 0) {
            data = inputStream.read();
            if (((data >= 97) && (data <= 122) || ((data >= 65) && (data <=90)))) {
                count++;
            }
        }
        System.out.println(count);
        inputStream.close();
    }
}
