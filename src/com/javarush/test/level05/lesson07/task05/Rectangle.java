package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    public int top = 0, left = 0, wight = 0, height = 0;

    public void initialize(int top, int left, int wight, int height) {
        this.top = top;
        this.left = left;
        this.wight = wight;
        this.height = height;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
    }

    public void initialize(int top, int left, int wight) {
        this.top = top;
        this.left = left;
        this.wight = wight;
        this.height = wight;
    }

    public void initialize(Rectangle anotherRectangle)
    {
        anotherRectangle.top = top;
        anotherRectangle.left = left;
        anotherRectangle.wight = wight;
        anotherRectangle.height = height;
    }
    //напишите тут ваш код

}
