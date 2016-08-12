package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        String s = args[0];

        FileInputStream inputStream = new FileInputStream(s);
        int symbol = inputStream.available();
        int space = 0;
        while (inputStream.available() > 0)
        {
            if ((char)inputStream.read() == ' ')
                space ++;
        }

        double d = (double) space/symbol* 100;
        System.out.printf("%.2f", d);
        inputStream.close();
    }
}
