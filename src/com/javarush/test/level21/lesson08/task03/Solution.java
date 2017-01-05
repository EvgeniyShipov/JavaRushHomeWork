package com.javarush.test.level21.lesson08.task03;

/* Запретить клонирование
Разрешите клонировать класс А
Запретите клонировать класс B
Разрешите клонировать класс C
Метод main не участвует в тестировании.
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        protected A clone() throws CloneNotSupportedException {
            return new A(this.getI(), this.getJ());
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        protected B clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B implements Cloneable {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        protected C clone() throws CloneNotSupportedException {
            return new C(super.getI(), super.getJ(), super.getName());
        }
    }

    public static void main(String[] args) {
        A a = new A(1, 1);
        B b = new B(2, 2, "Hi");
        C c = new C(3, 3, "Hi2");

        A aClone = null;
        C cClone = null;
        try {
            aClone = a.clone();
            cClone = c.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(a.toString());
        System.out.println(aClone.toString());

        System.out.println(b.toString());

        System.out.println(c.toString());
        System.out.println(cClone.toString());

        System.out.println(c.getName());
        System.out.println(cClone.getName());
    }
}
