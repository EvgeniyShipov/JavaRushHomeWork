package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<String>();
        set.add("Лев");
        set.add("Лада");
        set.add("Леопольд");
        set.add("Леонард");
        set.add("Лоток");
        set.add("Лагерь");
        set.add("Лазер");
        set.add("Лак");
        set.add("Ликер");
        set.add("Литр");
        set.add("Лера");
        set.add("Лимон");
        set.add("Лава");
        set.add("Лодка");
        set.add("Лошадь");
        set.add("Лизать");
        set.add("Лицо");
        set.add("Лжец");
        set.add("Льняной");
        set.add("Лафа");

        for (String text : set) {
            System.out.println(text);
        }

        return set;
        //напишите тут ваш код

    }
}
