package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    public Solution(int a) {
    }

    public Solution(int a, int b) {
    }

    public Solution(int a, int b, int c) {
    }

    protected Solution(char a) {
    }

    protected Solution(char a, char b) {
    }

    protected Solution(char a, char b, char c) {
    }

    private Solution(String a){
    }

    private Solution(String a, String b) {
    }

    private Solution(String a, String b, String c) {
    }

    Solution(Object a) {
    }

    Solution(Object a, Object b) {
    }

    Solution(Object a, Object b, Object c) {
    }
}

