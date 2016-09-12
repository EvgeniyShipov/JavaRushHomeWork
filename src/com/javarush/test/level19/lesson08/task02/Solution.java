package com.javarush.test.level19.lesson08.task02;

/* Ридер обертка 2
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна заменять все подстроки "te" на "??"
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Вывести модифицированную строку в консоль.
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
        String result = outputStream.toString();
        System.setOut(out);
        String line = new String(result);
        char[] charLine = line.toCharArray();
        String newLine = "";
        for (int i = 0; i < charLine.length; i++)
        {
            if ((charLine[i] == 't') && (charLine[i + 1] == 'e'))
            {
                charLine[i] = '?';
                charLine[i + 1] = '?';
            }
            newLine += charLine[i];
        }

        System.out.println(newLine);
    }

    public static class TestString
    {
        public void printSomething()
        {
            System.out.println("it's a text for testing");
        }
    }
}
