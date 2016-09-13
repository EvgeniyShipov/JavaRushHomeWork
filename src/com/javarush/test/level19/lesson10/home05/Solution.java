package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String fileName1 = args[0];
        String fileName2 = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));

        while (reader.ready()) {
            String[] line = reader.readLine().split(" ");
            for (String s : line) {
                for (String c : number) {
                    if (s.contains(c)) {
                        writer.write(s + " ");
                        break;
                    }
                }
            }
        }

        reader.close();
        writer.close();
    }
}
