package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();



    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        while (!(fileName = reader.readLine()).equals("exit")) {
            ReadThread thread = new ReadThread(fileName);
            thread.run();
        }
        reader.close();


    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
            //implement constructor body
        }

        public void run()
        {
            Map <Integer, Integer> map = new HashMap<Integer, Integer>();
            int number;
            try
            {
                FileInputStream inputStream = new FileInputStream(fileName);
                while (inputStream.available() > 0)
                {
                    number = 0;
                    int data = inputStream.read();
                    if (map.containsKey(data)) number = map.get(data) + 1;
                    map.put(data, number);
                }

                inputStream.close();
            } catch (IOException e) {

            }

            int maxValue = 0;
            for (Map.Entry <Integer, Integer> entry: map.entrySet())
            {
                if (entry.getValue() > maxValue)
                {
                    maxValue = entry.getValue();
                }
            }

            for (Map.Entry <Integer, Integer> entry2: map.entrySet())
            {
                if (entry2.getValue() == maxValue)
                {
                    resultMap.put(fileName, entry2.getKey());
                }
            }
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
