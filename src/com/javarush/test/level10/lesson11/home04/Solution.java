package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        String s1 = "";


        char[] ch = s.toCharArray();
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i = 0; i < ch.length; i++ )
        list.add(ch[i]);
        int h = 0;


        for (int j = 0; j < 40; j++)
        {
            s1 = "";

            for (int i = h; i < list.size(); i++)
            {

                s1 = s1 + list.get(i);
            }
            System.out.println(s1);
            h++;
        }
        //напишите тут ваш код
    }

}
