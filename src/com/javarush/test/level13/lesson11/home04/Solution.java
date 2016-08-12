package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();
        String text;
        String line ="";
        OutputStream outputText = new FileOutputStream(fileName);
        while (true)
        {
            text = reader.readLine();
            if (text.equals("exit"))
            {
                line = line + text;
                break;
            }
            line = line + text + "\r\n";
        }

        for (int i = 0; i < line.length(); i ++ )
        {
            outputText.write(line.charAt(i));
        }
        outputText.close();
        reader.close();
    }
}
