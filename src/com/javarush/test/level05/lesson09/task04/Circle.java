package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private int centerX = 0, centerY = 0, radius = 0, wight = 0;
    private String color = "white";

    public Circle(int centerX, int centerY, int radius)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius, int wight)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.wight = wight;
    }

    public Circle(int centerX, int centerY, int radius, int wight, String color)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.wight = wight;
        this.color = color;
    }//напишите тут ваш код

}
