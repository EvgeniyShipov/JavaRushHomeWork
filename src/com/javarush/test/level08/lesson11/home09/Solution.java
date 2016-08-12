package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {

        isDateOdd("MAY 1 2013");
        System.out.println("MAY 1 2013 = " + isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date)
    {
        Date ourDate = new Date(date);

        Date yearsTimeStart = new Date();
        yearsTimeStart.setDate(1);
        yearsTimeStart.setMonth(0);
        yearsTimeStart.setYear(ourDate.getYear());

        long days = (ourDate.getTime() - yearsTimeStart.getTime())/(24*60*60*1000);
        if (days%2 == 0) {return false;}
        else {return true;}
    }
}
