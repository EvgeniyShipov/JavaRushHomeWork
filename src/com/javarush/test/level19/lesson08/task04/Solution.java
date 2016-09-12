package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution
{
    public static TestString testString = new TestString();

    public static void main(String[] args)
    {
        PrintStream out = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        testString.printSomething();
        String[] line = outputStream.toString().split(" ");
        System.setOut(out);

        String first = line[0];
        String second = line[2];
        int result;
        if (line[1].equals("+"))
        {
            result = Integer.parseInt(first) + Integer.parseInt(second);
            System.out.println(first + " + " + second + " = " + result);
        }
        if (line[1].equals("-"))
        {
            result = Integer.parseInt(first) - Integer.parseInt(second);
            System.out.println(first + " - " + second + " = " + result);
        }
        if (line[1].equals("*"))
        {
            result = Integer.parseInt(first) * Integer.parseInt(second);
            System.out.println(first + " * " + second + " = " + result);
        }
    }

    public static class TestString
    {
        public void printSomething()
        {
            System.out.println("3 + 6 = ");
        }
    }
}

