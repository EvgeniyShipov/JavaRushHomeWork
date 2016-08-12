package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        url = url.substring(url.indexOf('?') + 1);
        String[] list = url.split("&");
        String[] list2;
        Double doubleObj;


        for (int i = 0; i < list.length; i++) {
            list2 = list[i].split("=");
            System.out.print(list2[0] + " ");
        }
        System.out.println();

        for (int i = 0; i < list.length; i++)
        {
            list2 = list[i].split("=");
            if (list2[0].equals("obj")) {

                try {
                    doubleObj = Double.parseDouble(list2[1]);
                    alert(doubleObj);
                }
                catch (Exception e) {
                    alert(list2[1]);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
