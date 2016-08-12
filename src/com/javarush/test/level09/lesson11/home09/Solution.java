package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{

    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map = new HashMap<>();
        map.put("Барсик", new Cat("Барсик"));
        map.put("Шарик", new Cat("Шарик"));
        map.put("Киска", new Cat("Киска"));
        map.put("Вонючка", new Cat("Вонючка"));
        map.put("Яна", new Cat("Яна"));
        map.put("Вячеслав", new Cat("Вячеслав"));
        map.put("Черри", new Cat("Черри"));
        map.put("Ник", new Cat("Ник"));
        map.put("Стейк", new Cat("Стейк"));
        map.put("Барсик2", new Cat("Барсик2"));

        return map;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet<Cat>();

        for ( Map.Entry<String, Cat> entry : map.entrySet())
        {
            set.add(entry.getValue());
        }

        return set;//напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
