package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1","Евгений");
        map.put("2","Наталья");
        map.put("3","Александр");
        map.put("4","Екатерина");
        map.put("5","Владимир");
        map.put("6","Евгения");
        map.put("7","Елена");
        map.put("8","Елена");
        map.put("9","Анастасия");
        map.put("10","Дмитрий");
        return map;//напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int x = 0;
        for (Map.Entry<String, String> name1 : map.entrySet())
        if (name1.getValue().equals(name))
        {
            x++;
        }
        return x;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int y = 0;
        for (Map.Entry<String,String> name2 : map.entrySet())
        if (name2.getKey().equals(lastName))
        {
            y++;
        }
        return y;//напишите тут ваш код

    }
}
