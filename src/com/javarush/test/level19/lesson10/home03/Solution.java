package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        BufferedReader reader = new BufferedReader((new FileReader(fileName)));
        while (reader.ready()) {
            String[] line = reader.readLine().split(" ");
            int year = Integer.parseInt(line[line.length - 1]);
            int month = Integer.parseInt(line[line.length - 2]);
            int day = Integer.parseInt(line[line.length - 3]);
            String name = line[0];
            for (int i = 1; i < line.length - 3; i++) {
                name += " " + line[i];
            }
            Date date = new Date(year, month - 1, day);
            PEOPLE.add(new Person(name, date));
        }
        reader.close();

    }
}
