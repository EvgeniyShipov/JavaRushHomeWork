package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int number;

        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available() > 0) {
            number = 0;
            int data = inputStream.read();
            if (map.containsKey(data)) number = map.get(data) + 1;
            map.put(data, number);
        }
        reader.close();
        inputStream.close();

        String allMin = "";
        int minValue = 999;

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if (entry.getValue() < minValue) {
                minValue = entry.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> entry2: map.entrySet()) {
            if (entry2.getValue() == minValue) { allMin += entry2.getKey();}
        }

        System.out.println(allMin);

    }
}
