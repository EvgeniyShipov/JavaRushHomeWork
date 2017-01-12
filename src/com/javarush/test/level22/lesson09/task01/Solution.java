package com.javarush.test.level22.lesson09.task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        String[] words = readLine();
        for (String word : words) {
            if (!list.contains(reverseWord(word))) {
                list.add(word);
            } else {
                result.add(createNewPair(word));
                list.remove(reverseWord(word));
            }
        }
    }

    public static String reverseWord(String word) {
        return new String(new StringBuilder(word).reverse());
    }

    public static Pair createNewPair(String word) {
        Pair pair = new Pair();
        pair.first = word;
        pair.second = reverseWord(word);
        return pair;
    }

    public static String[] readLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String line = fileReader.readLine();
        while (fileReader.ready()) {
            line += " " + fileReader.readLine();
        }
        fileReader.close();
        reader.close();
        return line.split(" ");
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }
}