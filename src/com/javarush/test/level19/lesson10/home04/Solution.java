package com.javarush.test.level19.lesson10.home04;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner scanner2 = new Scanner(System.in);
        String fileName = scanner2.nextLine();
        int number;
        scanner2.close();

        Scanner scanner = new Scanner(new FileReader(fileName));
        while (scanner.hasNext()) {
            number = 0;
            String line = scanner.nextLine();
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
        scanner.close();
    }
}
