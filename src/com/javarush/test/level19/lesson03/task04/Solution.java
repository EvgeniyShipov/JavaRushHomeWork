package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution
{
    public static class PersonScannerAdapter implements PersonScanner
    {
        private Scanner scanner;

        public PersonScannerAdapter(Scanner scanner)
        {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException, ParseException
        {
            String[] line = scanner.nextLine().split(" ");
            String lastName = line[0];
            String firstName = line[1];
            String middleName = line[2];
            int date = Integer.parseInt(line[3]);
            int month = Integer.parseInt(line[4]);
            int year = Integer.parseInt(line[5]);

            Date birthDate = new SimpleDateFormat("ddMMyyyy").parse("" + date+month+year);

            return new Person(firstName, middleName, lastName, birthDate);
        }

        @Override
        public void close() throws IOException
        {
            scanner.close();
        }
    }
}
