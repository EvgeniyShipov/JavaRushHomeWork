package com.javarush.test.level19.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
оригинальный   редактированный    общий
file1:         file2:             результат:(lines)

строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка4                           REMOVED строка4
строка5        строка5            SAME строка5
строка0                           ADDED строка0
строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка5                           ADDED строка5
строка4        строка4            SAME строка4
строка5                           REMOVED строка5
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
        BufferedReader reader2 = new BufferedReader(new FileReader(fileName2));

        List<String> list1 = new ArrayList<>();
        while (reader1.ready()) {
            list1.add(reader1.readLine());
        }

        List<String> list2 = new ArrayList<>();
        while (reader2.ready()) {
            list2.add(reader2.readLine());
        }

        int i1 = 0;
        int i2 = 0;

        while (i1 < list1.size() && i2 < list2.size()) {
            if (list1.get(i1).equals(list2.get(i2))) {
                lines.add(new LineItem(Type.SAME, list1.get(i1)));
                i1++;
                i2++;
            } else if (list1.get(i1).equals(list2.get(i2 + 1))) {
                lines.add(new LineItem(Type.ADDED, list2.get(i2)));
                i2++;
            } else if (list1.get(i1 + 1).equals(list2.get(i2))) {
                lines.add(new LineItem(Type.REMOVED, list1.get(i1)));
                i1++;
            }
        }

        if (i1< list1.size()) {
            lines.add(new LineItem(Type.REMOVED, list1.get(i1)));
        }

        if (i1< list2.size()) {
            lines.add(new LineItem(Type.ADDED, list2.get(i2)));
        }


        reader1.close();
        reader2.close();
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
