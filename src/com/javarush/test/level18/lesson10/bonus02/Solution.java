package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class Solution {
    private static Formatter formatter = new Formatter();

    public static void main(String[] args) throws Exception {

        Scanner scanner1 = new Scanner(System.in);
        String fileName = scanner1.nextLine();
        scanner1.close();

        Scanner scanner2 = new Scanner(new FileInputStream(fileName));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));

        String operation = args[0];
        String productName = getProductName(args);
        String price = args[args.length - 2];
        String quantity = args[args.length - 1];

        if (operation.equals("-c")) {
            int max = findMaximumId(scanner2);
            max++;
            String line = String.format("%-8s%-30s%-8s%-4s", max, productName, price, quantity);
            addInFile(writer, line);
        }
    }

    private static int findMaximumId(Scanner scanner) throws IOException {
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().substring(0, 8).trim();
            int id = Integer.parseInt(line);
            if (id > max) max = id;
        }
        scanner.close();
        return max;
    }

    private static void addInFile(PrintWriter writer, String line) throws IOException {
        writer.println(line);
        writer.close();
    }

    private static String getProductName(String[] args) {
        String productName = args[1];
        for (int i = 2; i < args.length - 2; i++) {
            productName = productName + " " + args[i];
        }

        return productName;
    }
}
