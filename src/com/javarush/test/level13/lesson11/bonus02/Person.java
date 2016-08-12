package com.javarush.test.level13.lesson11.bonus02;

public class Person implements RepkaItem
{
    private String name;
    private String namePadezh;

    @Override
    public String getNamePadezh()
    {
        return namePadezh;
    }

    public void pull(Person person)
    {
        System.out.println(name + " за " + person.getNamePadezh());
    }

    public Person(String name, String namePadezh)
    {
        this.name = name;
        this.namePadezh = namePadezh;
    }
}
