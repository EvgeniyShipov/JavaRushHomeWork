package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Евгений on 18.04.2016.
 */
public class SubSolution extends Solution
{
    public SubSolution(int a)
    {
        super(a);
    }

    public SubSolution(int a, int b)
    {
        super(a, b);
    }

    public SubSolution(int a, int b, int c)
    {
        super(a, b, c);
    }

    protected SubSolution(char a)
    {
        super(a);
    }

    protected SubSolution(char a, char b)
    {
        super(a, b);
    }

    protected SubSolution(char a, char b, char c) { super(a, b, c); }

    private SubSolution(String a){ super(a);
    }

    private SubSolution(String a, String b) { super(a, b);
    }

    private SubSolution(String a, String b, String c) { super(a, b, c);
    }

    SubSolution(Object a)
    {
        super(a);
    }

    SubSolution(Object a, Object b)
    {
        super(a, b);
    }

    SubSolution(Object a, Object b, Object c)
    {
        super(a, b, c);
    }



}
