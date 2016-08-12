package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        String surname;
        int age;
        boolean sex;
        int height;
        int weight;

        public Human(String name){
            this.name = name;
        }
        public Human(String name, String surname){
        this.name = name;
        this.surname = surname;
        }
        public Human(String name, String surname, boolean sex){
            this.name = name;
            this.surname = surname;
            this.sex = sex;
        }
        public Human(String name, String surname, int age, boolean sex){
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, String surname, int age){
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, int age, boolean sex, int height){
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.age = age;
            this.height = height;
        }

        public Human(String name, String surname, int age, boolean sex, int height, int weight){
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String surname, int height, int weight){
            this.name = name;
            this.surname = surname;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String surname, int age, int height, int weight){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, boolean sex, int height, int weight){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        //напишите тут ваши переменные и конструкторы
    }
}
