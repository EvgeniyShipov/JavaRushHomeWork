package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader rd = new BufferedReader (new InputStreamReader(System.in));

        int a = Integer.parseInt(rd.readLine());
        int b = Integer.parseInt(rd.readLine());
        int c = Integer.parseInt(rd.readLine());

        int nam = 0;
        if (((a >= b) && (a <= c)) || ((a <= b) && (a >= c))) {nam = a;}
        if (((b >= a) && (b <= c)) || ((b <= a) && (b >= c))) {nam = b;}
        if (((c >= a) && (c <= b)) || ((c <= a) && (c >= b))) {nam = c;}

        System.out.println(nam);
        //напишите тут ваш код
    }
}
