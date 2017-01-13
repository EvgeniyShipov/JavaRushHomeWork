package com.javarush.test.level22.lesson09.task03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Составить цепочку слов
В методе main считайте с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставить все слова в таком порядке,
чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Метод getLine должен возвращать любой вариант.
Слова разделять пробелом.
В файле не обязательно будет много слов.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        String line = "";
        while (reader.ready()) {
            line += reader.readLine() + " ";
        }
        bufferedReader.close();
        reader.close();
        String[] text = line.split(" ");
        StringBuilder result = getLine(text);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder stringBuilder = new StringBuilder();
        if (words.length == 0) {
            return stringBuilder;
        }
        List<String> list = new ArrayList<>();
        for (String w : words) {
            if (!list.contains(w)) {
                list.add(w);
            }
        }
        int x = 0;
        while (x != list.size()) {
            x = 1;
            List<String> list2 = new ArrayList<>();
            int count = list.size();
            Collections.shuffle(list);
            stringBuilder = new StringBuilder(list.get(0));
            list2.add(list.get(0));
            while (count > 0) {
                for (int i = 0; i < list.size(); i++) {
                    if (lastChar(new String(stringBuilder)) == firstChar(list.get(i)) && !list2.contains(list.get(i))) {
                        stringBuilder.append(" ").append(list.get(i));
                        list2.add(list.get(i));
                        x++;
                    }
                }
                count--;
            }

        }
        return stringBuilder;
    }

    public static char firstChar(String word) {
        if (word.length() == 0) {
            return 0;
        }
        return word.toLowerCase().charAt(0);
    }

    public static char lastChar(String word) {
        if (word.length() == 0) {
            return 0;
        }
        return word.toLowerCase().charAt(word.length() - 1);
    }
}