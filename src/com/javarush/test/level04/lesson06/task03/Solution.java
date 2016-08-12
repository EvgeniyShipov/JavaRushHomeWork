package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        int max = 0;
        int mid = 0;
        int min = 0;

        if (a>b && a>c) max = a;
        if (b>a && b>c) max = b;
        if (c>b && c>a) max = c;

        if ((a>b && a<c) || (a<b && a>c)) mid = a;
        if ((b>a && b<c) || (b<a && b>c)) mid = b;
        if ((c>b && c<a) || (c<b && c>a)) mid = c;

        if (a<b && a<c) min = a;
        if (b<a && b<c) min = b;
        if (c<b && c<a) min = c;

        System.out.println(max + " " + mid + " " + min);



        //напишите тут ваш код

    }
}
