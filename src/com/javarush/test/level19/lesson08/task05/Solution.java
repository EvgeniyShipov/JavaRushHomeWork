package com.javarush.test.level19.lesson08.task05;

/* Дублируем текст
Считайте с консоли имя файла
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна дублировать вывод всего текста в файл, имя которого вы считали
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Закройте поток файла

Пример вывода на экран:
it's a text for testing

Пример тела файла:
it's a text for testing
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException
    {
        PrintStream out = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        testString.printSomething();
        String line = outputStream.toString();
        System.setOut(out);

        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        bufferedWriter.write(line);
        bufferedWriter.close();

        System.out.println(line);
    }

    public static class TestString
    {
        public void printSomething()
        {
            System.out.println("it's a text for testing");
        }
    }
}

