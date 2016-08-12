package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String d1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        int d = Integer.parseInt(d1);
        int answer = 0;
        if (a>=b && a>=c && a>=d) answer = a;
        if (b>=a && b>=c && b>=d) answer = b;
        if (c>=b && c>=a && c>=d) answer = c;
        if (d>=b && d>=c && d>=a) answer = d;

        System.out.println(answer);


        //напишите тут ваш код

    }
}
