package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a = 10, b = 9;
        while (a > 0) {

            while (b > 0) {
                System.out.print("S");
                b--;
            }
            b = 9;
            System.out.println("S");
            a--;

        }//напишите тут ваш код

    }
}
