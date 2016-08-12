package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int current;
        int count = Integer.parseInt(reader.readLine());
        if(count > 0)
        {
            for (int t = 0; t < count; t++)
            {
                current = Integer.parseInt(reader.readLine());
                if (current > maximum) maximum = current;
            }
            System.out.println(maximum);
        } else {
            System.err.println("N < 0");
        }
    }
}
