package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
        String result = "";
        while (reader.ready()) {
            String[] line = reader.readLine().split(" ");
            for (String s : line) {
                if (s.length() > 6) {
                    result += s + ",";
                }
            }
        }

        writer.write(result.substring(0, result.lastIndexOf(",")));

        reader.close();
        writer.close();
    }
}
