package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>();
        String fileName = args[0];
        BufferedReader reader = new BufferedReader((new FileReader(fileName)));
        while (reader.ready()) {
            String[] line = reader.readLine().split(" ");
            String name = line[0];
            Double value = Double.parseDouble(line[1]);
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + value);
            } else map.put(name, value);
        }
        reader.close();

        Double max = Double.MIN_VALUE;
        for (Map.Entry<String, Double> iterator : map.entrySet()) {
            if (max < iterator.getValue()) {
                max = iterator.getValue();
            }
        }
        for (Map.Entry<String, Double> iterator : map.entrySet()) {
            if (max == iterator.getValue()) {
                System.out.println(iterator.getKey());
            }
        }
    }
}
