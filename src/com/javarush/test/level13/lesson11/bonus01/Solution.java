package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader dataFromFile = new BufferedReader(new FileReader(reader.readLine()));

        ArrayList<Integer> dataList = new ArrayList<Integer>();

        String s = "";

        while ((s = dataFromFile.readLine()) != null)
        {
            int data = Integer.parseInt(s);
            if (data % 2 == 0)
            {
                dataList.add(data);
            }
        }

        reader.close();
        dataFromFile.close();

        Collections.sort(dataList);

        for (int i = 0; i < dataList.size(); i++)
        {
            System.out.println(dataList.get(i));
        }
        // напишите тут ваш код
    }
}
