package com.javarush.test.level19.lesson10.home04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words
Закрыть потоки. Не использовать try-with-resources

Пример: words содержит слова А, Б, В
Строки:
В Б А Д  //3 слова из words, не подходит
Д А Д    //1 слово из words, не подходит
Д А Б Д  //2 слова - подходит, выводим
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        int number = 0;

        BufferedReader reader = new BufferedReader((new FileReader(fileName)));
        while (reader.ready()) {
            number = 0;
            String line = reader.readLine();
            String[] line1 = line.split(" ");
            for (String s : words) {
                for (String l : line1) {
                    if (s.equals(l)) {
                        number++;
                    }
                }

            }

            if (number == 2) {
                System.out.println(line);
            }
        }
        reader.close();
    }
}
