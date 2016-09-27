package com.javarush.test.level20.lesson04.task04;

import java.io.*;

/* Как сериализовать static?
Сделайте так, чтобы сериализация класса ClassWithStatic была возможной
*/
public class Solution implements Serializable {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "it's test static string";
        public int i;
        public int j;

        public static void serializeStatic(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeChars(staticString);
            objectOutputStream.close();
        }

        public static void deserializeStatic(ObjectInputStream objectInputStream) throws IOException {
            staticString = objectInputStream.readLine();
            objectInputStream.close();
        }
    }
}
