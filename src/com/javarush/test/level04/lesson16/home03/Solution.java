package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader rd = new BufferedReader (new InputStreamReader(System.in));

        int b =0;
        while (true) {
            int a = Integer.parseInt(rd.readLine());
            b = b + a;
            if (a == -1 || b ==-1) break;

        }
        System.out.println(b);



        //напишите тут ваш код
    }
}
