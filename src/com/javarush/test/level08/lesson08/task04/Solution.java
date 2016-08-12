package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
        {
            HashMap<String, Date> map = new HashMap<String, Date>();
            map.put("Сталлоне", new Date("JUNE 1 1980"));
            map.put("Ван дам", new Date("JULY 1 1980"));
            map.put("Шварц", new Date("AUGUST 1 1980"));
            map.put("Чан", new Date("OCTOBER 1 1980"));
            map.put("Вилис", new Date("MARCH 1 1980"));
            map.put("Норрис", new Date("APRIL 1 1980"));
            map.put("Лунгрен", new Date("SEPTEMBER 1 1980"));
            map.put("Стэтэм", new Date("NOVEMBER 1 1980"));
            map.put("Бандэрос", new Date("DECEMBER 1 1980"));
            map.put("Никулин", new Date("JUNE 1 1980"));

            //Напишите тут ваш код
            return map;
        }
    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        HashMap<String, Date> copy = new HashMap<String, Date>(map);
        for (Map.Entry<String, Date> pair: copy.entrySet())
        {
            if ((pair.getValue().getMonth() > 4) && (pair.getValue().getMonth() < 8))
                map.remove(pair.getKey());
        }
        //Напишите тут ваш код
    }
}
